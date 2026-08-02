package com.example.BloodBank.Service;

import com.example.BloodBank.Entity.donor;
import com.example.BloodBank.Repository.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DonorService {
    @Autowired
    private DonorRepository donorRepository;

    public donor saveDonor(donor donor){
        return donorRepository.save(donor);
    }

    public List<donor> getAllDonors(){
        return donorRepository.findAll();
    }

    public Optional<donor> getDonorById(Long id){
        return donorRepository.findById(id);
    }

    public void deleteDonor(Long id){
        donorRepository.deleteById(id);
    }
}
