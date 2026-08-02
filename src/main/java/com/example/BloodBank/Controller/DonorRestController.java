package com.example.BloodBank.Controller;


import com.example.BloodBank.Entity.donor;
import com.example.BloodBank.Service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donor")
public class DonorRestController {

    @Autowired
    private DonorService donorService;

    @PostMapping
    public donor createDonor(@RequestBody donor donor){
        return donorService.saveDonor(donor);
    }

    @GetMapping
    public List<donor> getAllDonors(){
        return donorService.getAllDonors();
    }

    @GetMapping("/{id}")
    public ResponseEntity<donor> getDonorById(@PathVariable Long id){
        return donorService.getDonorById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDonor(@PathVariable Long id){
        donorService.deleteDonor(id);
        return ResponseEntity.noContent().build();
    }
}


