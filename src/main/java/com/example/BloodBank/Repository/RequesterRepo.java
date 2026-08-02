package com.example.BloodBank.Repository;

import com.example.BloodBank.Entity.Requester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequesterRepo extends JpaRepository<Requester,Long> {

}
