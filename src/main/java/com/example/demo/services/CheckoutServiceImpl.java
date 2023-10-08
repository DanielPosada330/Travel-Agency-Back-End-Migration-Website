package com.example.demo.services;

import com.example.demo.dao.CartRepository;
import com.example.demo.dao.CustomerRepository;
import com.example.demo.dto.Purchase;
import com.example.demo.dto.PurchaseResponse;
import com.example.demo.entities.Cart;
import com.example.demo.entities.CartItem;
import com.example.demo.entities.Customer;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService{

    //private CustomerRepository customerRepository;

    private CartRepository cartRepository;

    //public CheckoutServiceImpl(CustomerRepository customerRepository){
        //this.customerRepository = customerRepository;
    //}
    @Autowired
    public CheckoutServiceImpl(CartRepository cartRepository){
        this.cartRepository = cartRepository;
    }
    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        // retrieve the cart info from dto
        Cart cart = purchase.getCart();
        // generate tracking number
        String orderTrackingNumber = generateOrderTrackingNumber();
        cart.setOrderTrackingNumber(orderTrackingNumber);
        cart.setStatus(Cart.StatusType.ordered);
        // populate cart with cartItems
        Set< CartItem> cartItems = purchase.getCartItems();
        cartItems.forEach(item -> item.setCart(cart));
        cartItems.forEach(item -> cart.add(item));
        // populate customer with cart
        Customer customer = purchase.getCustomer();
        customer.add(cart);
        // save to the database
        //customerRepository.save(customer);
        cartRepository.save(cart);

        // return a response
        return new PurchaseResponse(orderTrackingNumber);

    }

    private String generateOrderTrackingNumber() {

        // generate a random UUID number (UUID version-4)
        // For details see: https://en.wikipediia.org/wiki/Universally_unique_identifier

        return UUID.randomUUID().toString();
    }
}
