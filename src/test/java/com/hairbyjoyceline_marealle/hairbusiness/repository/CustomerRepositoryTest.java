package com.hairbyjoyceline_marealle.hairbusiness.repository;

import com.hairbyjoyceline_marealle.hairbusiness.entity.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class CustomerRepositoryTest  {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private TestEntityManager entityManager;

    Customer customer1;
    Customer customer2;
    Customer savedCustomer1;

    @BeforeEach
    public void setUp(){
        // create customers
        customer1 = new Customer();
        customer1.setfullName("Joy Marealle");
        customer1.setEmail("joy@gmail.com");
        customer1.setPhoneNumber(5853505692L);

        customer2 = new Customer();
        customer2.setfullName("Eva Marealle");
        customer2.setEmail("eva@gmail.com");
        customer2.setPhoneNumber(3134245581L);

    }
    @Test
    void testFindAllCustomers(){
        // Save customers
        customerRepository.save(customer1);
        customerRepository.save(customer2);


       System.out.print(customer1);

        //find all customers
        List<Customer> customers = customerRepository.findAll();

      //Verify that both customers were saved and retrieved correctly
        assertThat(customers).hasSize(2).contains(customer1, customer2);

}

@Test
    void testFindCustomerById(){
    // Save customers
    Customer savedCustomer1= customerRepository.save(customer1);
    Customer saveCustomer2 =  customerRepository.save(customer2);

    // Find customer by id
    Optional<Customer> optionalCustomer = customerRepository.findById(customer2.getCustomer_id());

   // Verify the customer is present and attributes match
    assertThat(optionalCustomer).isPresent();
    Customer customer = optionalCustomer.get();
    assertThat(customer.getCustomer_id()).isEqualTo(customer2.getCustomer_id());
    assertThat(customer.getfullName()).isEqualTo(customer2.getfullName());

}

@Test
    void testSaveCustomer(){
    // Save the customer using the repository
    Customer savedCustomer1= customerRepository.save(customer1);

    // Assert that ID is generated since when save entities Id generated
    assertThat(savedCustomer1.getCustomer_id()).isNotNull();

    //assert that saved customers details match input customer
    assertThat(savedCustomer1.getfullName()).isEqualTo(customer1.getfullName());
    assertThat(savedCustomer1.getEmail()).isEqualTo(customer1.getEmail());
    assertThat(savedCustomer1.getPhoneNumber()).isEqualTo(customer1.getPhoneNumber());
}

@Test
    void testMarkCustomerForDeletion(){
        // Save customer to the repository
        Customer savedCustomer1= customerRepository.save(customer1);

        // Mark the customer as removed
        savedCustomer1.setRemoved(true);

        // Save to update existing customer in data base
       Customer updatedCustomer1 = customerRepository.save(customer1);

        // Assert if isRemoved is true
    assertThat(updatedCustomer1.isRemoved()).isEqualTo(true);
}
}
