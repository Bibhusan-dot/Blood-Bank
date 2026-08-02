package com.example.BloodBank.Controller;

import com.example.BloodBank.Entity.donor;
import com.example.BloodBank.Service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/donors")
public class DonorViewController {

    @Autowired
    private DonorService donorService;

    @GetMapping
    public String listDonors(Model model){
        model.addAttribute("donors",donorService.getAllDonors());
        return "donors";
    }

    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("donor", new donor());
        return "donor-form";
    }

    @PostMapping
    public String saveDonor(@ModelAttribute donor donor){
        donorService.saveDonor(donor);
        return "redirect:/donors";
    }
}
