package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigInteger;
import java.util.Date;
import java.util.Set;


//Create Cart_item table with columns
@Entity
@Table(name = "cart_items")
@NoArgsConstructor
@AllArgsConstructor
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

    //@Column(name = "vacation_id")
    //private BigInteger vacation_id;

    //@Column(name = "cart_id")
    //private BigInteger cart_id;

    @ManyToMany(mappedBy = "cart_items")
    private Set<Excursions> excursions;

    @ManyToOne
    @JoinColumn(name = "cart_id", nullable = false)
    private Carts carts;

    @ManyToOne
    @JoinColumn(name = "vacation_id", nullable = false)
    private Vacations vacation_id;
}
