

package com.example.demo.bootstrap;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Division;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (customerRepository.count() < 2 ) {

            // Create new customers to be populated if only the base customer "John Doe" is in the database.
            Division southTexas = new Division();
            southTexas.setId(42L);

            // Customer 1
            Customer juan = new Customer();
            juan.setFirstName("Juan");
            juan.setLastName("Ruiz");
            juan.setAddress("123 My Street");
            juan.setPostal_code("12345");
            juan.setPhone("(123)4567890");
            juan.setDivision(southTexas);
            customerRepository.save(juan);

            // Customer 2
            Customer daniel = new Customer();
            daniel.setFirstName("Daniel");
            daniel.setLastName("Abel");
            daniel.setAddress("123 Make Believe Street");
            daniel.setPostal_code("23456");
            daniel.setPhone("(223)4567890");
            daniel.setDivision(southTexas);
            customerRepository.save(daniel);

            // Customer 3
            Customer david = new Customer();
            david.setFirstName("David");
            david.setLastName("Abiel");
            david.setAddress("123 Make Believe Avenue");
            david.setPostal_code("22222");
            david.setPhone("(222)4567890");
            david.setDivision(southTexas);
            customerRepository.save(david);

            // Customer 4
            Customer drogo = new Customer();
            drogo.setFirstName("Drogo");
            drogo.setLastName("Rodriguez");
            drogo.setAddress("222 Make Believe Loop");
            drogo.setPostal_code("33333");
            drogo.setPhone("(333)1234567");
            drogo.setDivision(southTexas);
            customerRepository.save(drogo);

            // Customer 5
            Customer dingo = new Customer();
            dingo.setFirstName("Dingo");
            dingo.setLastName("Lopez");
            dingo.setAddress("444 My House");
            dingo.setPostal_code("44444");
            dingo.setPhone("(444)1234567");
            dingo.setDivision(southTexas);
            customerRepository.save(dingo);
        }


    }

}
