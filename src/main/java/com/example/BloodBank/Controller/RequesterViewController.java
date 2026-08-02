package com.example.BloodBank.Controller;

import com.example.BloodBank.Entity.Requester;
import com.example.BloodBank.Service.RequesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/request")
public class RequesterViewController {
    @Autowired
    private RequesterService requesterService;

    @GetMapping
    public String showForm(Model model){
        model.addAttribute("requester",new Requester());
        return "request";
    }

    @PostMapping
    public String save(@ModelAttribute Requester requester){
        requesterService.save(requester);
        return "redirect:/request/success";
    }

    @GetMapping("success")
    public String sucess(){
        return "formSubmitted";
    }
}
