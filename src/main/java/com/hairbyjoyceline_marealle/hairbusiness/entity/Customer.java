package com.hairbyjoyceline_marealle.hairbusiness.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "customers", schema = "hair_business")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Builder
public class Customer implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "phone_number",nullable = false)
    private Long phoneNumber;

    @Column(name = "is_removed",nullable = false)
    private boolean isRemoved = false;

    //    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @OrderBy(value = "appointment_id desc")
//    private final List<Appointment> appointments = new ArrayList<>();
}
