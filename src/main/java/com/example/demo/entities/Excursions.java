package com.example.demo.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.Set;

//Create Cart_item table with columns
@Entity
@Table(name = "excursions")
@Getter
@Setter
public class Excursions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //private variables represent column names in SQL table
    @Column(name = "excursion_id")
    private BigInteger excursion_id;

    @Column(name = "create_date")
    @CreationTimestamp
    private Date create_date;

    @Column(name = "excursion_price")
    private BigDecimal excursion_price;

    @Column(name = "excursion_title")
    private String excursion_title;

    @Column(name = "image_url")
    private String image_url;

    @Column(name = "last_update")
    @UpdateTimestamp
    private Date last_update;

    @ManyToOne
    @JoinColumn(name = "vacation_id", nullable = false)
    private Vacations vacation_id;

    @ManyToMany
    @JoinTable(name = "excursion_cartitem",
    joinColumns = @JoinColumn(name = "excursion_id"),
            inverseJoinColumns = @JoinColumn(name = "cart_item_id"))
    private Set<Cart_items> cart_items;
}
