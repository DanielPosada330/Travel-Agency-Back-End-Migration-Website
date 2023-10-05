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
@Table(name = "cart_items")
@Getter
@Setter
public class Cart_items {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //private variables represent column names in SQL table
    @Column(name = "cart_item_id")
    private BigInteger cart_item_id;

    @Column(name = "create_date")
    @CreationTimestamp
    private Date create_date;

    @Column(name = "last_update")
    @UpdateTimestamp
    private Date last_update;

    @Column(name = "cart_id")
    private BigInteger cart_id;

    @Column(name = "vacation_id")
    private BigInteger vacation_id;
}
