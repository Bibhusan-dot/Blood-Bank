package com.example.BloodBank.Controller;

import com.example.BloodBank.Service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bloodunit")
public class BloodUnitViewController {
    @Autowired
    private DonorService donorUnitService;

    @GetMapping("/view")
    public String listBloodUnit(Model model){
        model.addAttribute("bloodUnit",donorUnitService.getAllDonors());
        return "bloodunit";
    }
}
