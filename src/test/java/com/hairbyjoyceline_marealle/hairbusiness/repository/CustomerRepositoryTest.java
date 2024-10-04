package com.hairbyjoyceline_marealle.hairbusiness.repository;

import com.hairbyjoyceline_marealle.hairbusiness.entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    void testFindAllCustomers(){
        Customer customer1 = new Customer();
        customer1.setName("Joy");
        customer1.setEmail("joy@gmail.com");
        customer1.setPhoneNumber(5853505692L);

        Customer customer2 = new Customer();
        customer1.setName("Eva");
        customer1.setEmail("eva@gmail.com");
        customer1.setPhoneNumber(3134245581L);

        entityManager.persist(customer1);

        List<Customer> customers = customerRepository.findAll();
        assertThat(customers).hasSize(1).contains(customer1, customer2);

}

@Test
    void testFindCustomerById(){}
}
