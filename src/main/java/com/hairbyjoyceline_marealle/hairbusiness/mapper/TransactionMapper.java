package com.hairbyjoyceline_marealle.hairbusiness.mapper;

import com.hairbyjoyceline_marealle.hairbusiness.dto.TransactionDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.TransactionRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.entity.Customer;
import com.hairbyjoyceline_marealle.hairbusiness.entity.HairStyle;
import com.hairbyjoyceline_marealle.hairbusiness.entity.Transaction;
import com.hairbyjoyceline_marealle.hairbusiness.exception.CustomerNotFoundException;
import com.hairbyjoyceline_marealle.hairbusiness.exception.HairStyleNotFoundException;
import com.hairbyjoyceline_marealle.hairbusiness.repository.CustomerRepository;
import com.hairbyjoyceline_marealle.hairbusiness.repository.HairStyleRepository;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component //spring inject it into service layer and non- static toEntity
public class TransactionMapper {
    private final HairStyleRepository hairStyleRepository;
    private final CustomerRepository customerRepository;

    public TransactionMapper(HairStyleRepository hairStyleRepository, CustomerRepository customerRepository) {
        this.hairStyleRepository = hairStyleRepository;
        this.customerRepository = customerRepository;
    }

    // Static toEntity method with repositories passed as parameters
    public  Transaction toEntity(TransactionRequestDTO transactionRequestDTO) {
        // Fetch HairService and Customer from repos
        HairStyle hairService = hairStyleRepository.findById(transactionRequestDTO.hairService_id())
                .orElseThrow(() -> new HairStyleNotFoundException(transactionRequestDTO.hairService_id()));

        Customer customer = customerRepository.findById(transactionRequestDTO.customer_id())
                .orElseThrow(() -> new CustomerNotFoundException(transactionRequestDTO.customer_id()));

        // Create and return the Transaction entity
        return new Transaction(
                LocalDate.now(),
                transactionRequestDTO.amount(),
                transactionRequestDTO.paymentMethod(),
                hairService,
                customer,
                transactionRequestDTO.transactionType()
        );
    }

    public static TransactionDTO toDTO(Transaction transaction) {
        return new TransactionDTO(
                transaction.getTransaction_id(),
                transaction.getTransaction_date(),
                transaction.getAmount(),
                transaction.getPaymentMethod(),
                HairStyleMapper.toDTO(transaction.getHairService()),
                CustomerMapper.toDTO(transaction.getCustomer()),
                transaction.getTransactionType(),
                transaction.getTransactionStatus()
        );
    }

    public static List<TransactionDTO> toDTO (List<Transaction> transactions){
        return transactions.stream()
                .map(transaction -> new TransactionDTO(
                        transaction.getTransaction_id(),
                        transaction.getTransaction_date(),
                        transaction.getAmount(),
                        transaction.getPaymentMethod(),
                        HairStyleMapper.toDTO(transaction.getHairService()),
                        CustomerMapper.toDTO(transaction.getCustomer()),
                        transaction.getTransactionType(),
                        transaction.getTransactionStatus()

        )).toList();
    }

}
