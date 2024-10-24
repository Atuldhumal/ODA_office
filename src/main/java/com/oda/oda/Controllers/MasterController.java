package com.oda.oda.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oda.oda.Entities.BatchMaster;
import com.oda.oda.Entities.Branch;
import com.oda.oda.FormValidation.RegisterstudentForm;
import com.oda.oda.services.MasterService;
import org.springframework.web.bind.annotation.ModelAttribute;

import jakarta.validation.Valid;

@Controller
@RequestMapping("master")
public class MasterController {

    @Autowired
    MasterService masterService;

    // for Student registration form
    @RequestMapping("/studentregistrationform")
    public String studentregistrationform(Model model) {
        // *****************************************
        // fetch data from DB for HTML form
        List<BatchMaster> allbatchdetails = masterService.getallbatchdetails();
        List<Branch> allbrachdetails = masterService.getallbranchdetails();
        model.addAttribute("allbatchDetails", allbatchdetails);
        model.addAttribute("allbrachdetails", allbrachdetails);
        // ###################################
        RegisterstudentForm registerstudentForm = new RegisterstudentForm();
        model.addAttribute("registerstudentForm", registerstudentForm);

        return "master/studentregistrationform";
    }

    @RequestMapping(value = "/registerstudent", method = RequestMethod.POST)
    public String registerstudent(@Valid @ModelAttribute RegisterstudentForm registerstudentForm,
            BindingResult bindingResult) {

        System.out.println("bind result is " + bindingResult);
        // validate form data
        if (bindingResult.hasErrors()) {
            return "master/studentregistrationform";
        }

        return "redirect:/master/studentregistrationform";
    }

}
