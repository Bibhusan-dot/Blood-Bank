package com.example.BloodBank.Service;

import com.example.BloodBank.Entity.Requester;
import com.example.BloodBank.Repository.RequesterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequesterService {
    @Autowired
    private RequesterRepo requesterRepo;

    public Requester save(Requester requester){
        return requesterRepo.save(requester);
    }
}
