package com.example.demo.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

//Create Cart_item table with columns
@Entity
@Table(name = "vacations")
@Getter
@Setter
public class Vacations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //private variables represent column names in SQL table
    @Column(name = "vacation_id")
    private BigInteger vacation_id;

    @Column(name = "create_date")
    @CreationTimestamp
    private Date create_date;

    @Column(name = "description")
    private String description;

    @Column(name = "image_url")
    private String image_url;

    @Column(name = "last_update")
    @UpdateTimestamp
    private Date last_update;

    @Column(name = "travel_fare_price")
    private BigDecimal travel_fare_price;

    @Column(name = "customer_id")
    private String vacation_title;
}
