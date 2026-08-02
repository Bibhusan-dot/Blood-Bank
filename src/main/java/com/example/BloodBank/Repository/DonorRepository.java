package com.example.BloodBank.Repository;

import com.example.BloodBank.Entity.donor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonorRepository extends JpaRepository<donor,Long> {

}
