package com.example.BloodBank.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Requester")
public class Requester {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "req_seq")
    @SequenceGenerator(name = "req_seq",sequenceName="REQ_SEQ",allocationSize = 1)
    private Long requesterId;

    @Column(name = "Full_name")
    private String fullname;

    @Column(name = "Phone_number")
    private String phoneNumber;

}
