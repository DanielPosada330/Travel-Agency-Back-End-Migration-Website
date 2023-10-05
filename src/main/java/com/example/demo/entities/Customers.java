package com.example.demo.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigInteger;
import java.util.Date;

//Create Cart_item table with columns
@Entity
@Table(name = "customers")
@Getter
@Setter
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //private variables represent column names in SQL table
    @Column(name = "customer_id")
    private BigInteger customer_id;

    @Column(name = "address")
    private String address;

    @Column(name = "create_date")
    @CreationTimestamp
    private Date create_date;

    @Column(name = "customer_first_name")
    private String customer_first_name;

    @Column(name = "customer_last_name")
    private String customer_last_name;

    @Column(name = "last_update")
    @UpdateTimestamp
    private Date last_update;

    @Column(name = "phone")
    private String phone;

    @Column(name = "postal_code")
    private String postal_code;

    @Column(name = "division_id")
    private BigInteger division_id;
}
