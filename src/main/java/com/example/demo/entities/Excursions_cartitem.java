package com.example.demo.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

//Create Cart_item table with columns
@Entity
@Table(name = "excursions_cartitem")
@Getter
@Setter
public class Excursions_cartitem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //private variables represent column names in SQL table
    @Column(name = "cart_item_id")
    private BigInteger cart_item_id;

    @Column(name = "excursion_id")
    private BigInteger excursion_id;
}
