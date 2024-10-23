package com.oda.oda.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oda.oda.Entities.BatchMaster;
import com.oda.oda.Entities.Branch;
import com.oda.oda.services.MasterService;

@Controller
public class PageController {

    @Autowired
 MasterService masterService;
    // for home page redirect
    @RequestMapping("/")
    public String index() {
        return "redirect:/home";
    }
    // for home page mapping
    @RequestMapping("/home")
    public String home(){
        return "home";
    }

    // for Student registration form
    @RequestMapping("/studentregistrationform")
    public String studentregistrationform(Model model){
     List<BatchMaster> allbatchdetails =   masterService.getallbatchdetails();
    List<Branch> allbrachdetails = masterService.getallbranchdetails();
        model.addAttribute("allbatchDetails", allbatchdetails);
        model.addAttribute("allbrachdetails", allbrachdetails);
        return "studentregistrationform";
    }

    




}
