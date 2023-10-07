package com.example.demo.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigInteger;
import java.util.Date;
import java.util.Set;

//Create Cart_item table with columns
@Entity
@Table(name = "divisions")
@Getter
@Setter
public class Divisions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //private variables represent column names in SQL table
    @Column(name = "division")
    private String division;

    @Column(name = "division_id")
    private BigInteger division_id;

    @Column(name = "create_date")
    @CreationTimestamp
    private Date create_date;

    @Column(name = "last_update")
    @UpdateTimestamp
    private Date last_update;

    //@Column(name = "country_id")
    //private BigInteger country_id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "divisions", fetch = FetchType.LAZY)
    private Set<Customers> customers;

    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false)
    private Countries countries;
}
