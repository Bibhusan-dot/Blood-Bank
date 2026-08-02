package com.example.BloodBank.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Donor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class donor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "donor_seq")
    @SequenceGenerator(name = "donor_seq",sequenceName="DONOR_SEQ",allocationSize = 1)
    private Long donorId;

    @Column(nullable = false)
    private String name;

    private int age;

    @Column(name = "blood_type")
    private String bloodType;

    @Column(name = "contact_number")
    private String contactNumber;

    private String email;

    @Column(name = "last_donation_date")
    private String lastDonationDate;

}