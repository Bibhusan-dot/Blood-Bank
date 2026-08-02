package com.example.BloodBank.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Home")
public class HomeViewController {

    @GetMapping
    public String home(){
        return "Home";
    }

    @GetMapping("/donors")
    public String redirectToDonors(){
        return "redirect:/donors";
    }

    @GetMapping("/addDonors")
    public String redirectToAddDonors(){
        return "redirect:/donors/new";
    }

    @GetMapping("/requesting")
    public String redirectToRequest(){
        return "redirect:/request";
    }

}
