package challenge.database.programming_challenge;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    @Autowired
    ResponseRepository repo;

    @GetMapping("/registration")
    public String registrationForm(Model model){
        //This method serves a form to the user as a GET request for their registration information
        model.addAttribute("customer", new Customer());
        return "form";
    }

    @PostMapping("/registration")
    public String registrationSubmit(@ModelAttribute Customer customer, Model model){
        //This method expects a POST request (which is in the form of the registration being completed) and process the data
        model.addAttribute("customer",customer);

        customer.setRegistered(new Date()); // This finds the current date and time and sets the user's registered attribute to this
        customer.setEmailAddress(customer.getEmailAddress().toLowerCase()); // This takes the email address which was inputted by the user and makes it lowercase in order to guarantee uniqueness

        if (repo.findEmail(customer.getEmailAddress()) != null){
            // This if condition checks to see if the email address the user entered is a duplicate or not and if it is, the user will be redirected to a different page
            return "duplicate";
        }
        repo.save(customer);

        return "success";
    }
}
