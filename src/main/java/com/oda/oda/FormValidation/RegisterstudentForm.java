package com.oda.oda.FormValidation;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RegisterstudentForm {

    @NotBlank(message = " First name Is Required") // for form validation
    @Size(max = 15, message = "Max 15 Charecter allowed")
    private String firstname;

    @NotBlank(message = " First name Is Required") // for form validation
    @Size(max = 15, message = "Max 15 Charecter allowed")
    private String lastname;

    @NotBlank(message = " Address Is Required") // for form validation
    @Size(max = 250, message = "Max 250 Charecter allowed")
    private String address;

    @Email(message = "invalid Email Address")
    private String email;

    @NotBlank(message = "Phone Number Is Required") // for form validation
    @Pattern(regexp = "^(\\+91[\\-\\s]?)?[6-9]{1}[0-9]{9}$", message = "Invalid Indian phone number")
    private String phoneno;

    @NotBlank(message = "Alternative Number Is Required") // for form validation
    @Pattern(regexp = "^(\\+91[\\-\\s]?)?[6-9]{1}[0-9]{9}$", message = "Invalid Indian phone number")
    private String parents_phoneno;

    @NotNull(message = "Please select a valid branch")
    private int branch_id;

    @NotNull(message = "Please select a valid Batch")
    private int Batch_id;

    @NotBlank(message = " First name Is Required") // for form validation
    @Size(max = 250, message = "Max 250 Charecter Allowed")
    private String about;

    @NotNull(message = "Please upload a file")
    private String Profile_pic;

}
