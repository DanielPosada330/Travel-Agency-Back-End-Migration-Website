package com.example.demo.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.Set;

//Create Cart_item table with columns
@Entity
@Table(name = "carts")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //private variables represent column names in SQL table
    @Column(name  = "cart_id")
    private Long id;

    @Column(name  = "order_tracking_number")
    private String orderTrackingNumber;

    @Column(name  = "package_price")
    private BigDecimal package_price;

    @Column(name  = "party_size")
    private int party_size;

    public enum StatusType {
        pending, ordered, canceled
    }
    @Enumerated(EnumType.STRING)
    private StatusType status;

    @Column(name  = "create_date")
    @CreationTimestamp
    private Date create_date;

    @Column(name  = "last_update")
    @UpdateTimestamp
    private Date last_update;

    //@Column(name = "customer_id")
    //private BigInteger customer_id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cart", fetch = FetchType.LAZY)
    private Set<CartItem> cartItem;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false, insertable = false, updatable = false)
    private Customer customer;

}
