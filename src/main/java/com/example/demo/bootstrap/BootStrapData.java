/*

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

        Division SouthTexas = new Division();
        SouthTexas.setId(1L);

        Customer daniel = new Customer("Daniel", "Abel", "123 Make Believe Street", "12345", "(123)4567890", SouthTexas);
        SouthTexas.getCustomers().add(daniel);

        customerRepository.save(daniel);

        Customer david =  new Customer("David", "Abiel", "123 Make Believe Street", "12345", "(123)4567890", SouthTexas);
        SouthTexas.getCustomers().add(david);

        customerRepository.save(david);

        Customer drogo = new Customer("Drogo", "Adel", "123 Make Believe Street", "12345", "(123)4567890", SouthTexas);
        SouthTexas.getCustomers().add(drogo);

        customerRepository.save(drogo);
        Customer dingo = new Customer("Dingo", "Avel", "123 Make Believe Street", "12345", "(123)4567890", SouthTexas);
        SouthTexas.getCustomers().add(dingo);

        customerRepository.save(dingo);
        Customer dojo = new Customer("Dojo", "Adel", "123 Make Believe Street", "12345", "(123)4567890", SouthTexas);
        SouthTexas.getCustomers().add(dojo);

        customerRepository.save(dojo);



    }
}
*/