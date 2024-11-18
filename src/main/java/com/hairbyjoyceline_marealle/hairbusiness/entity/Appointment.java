//package com.hairbyjoyceline_marealle.hairbusiness.entity;
//
//import com.fasterxml.jackson.annotation.JsonIdentityInfo;
//import com.fasterxml.jackson.annotation.ObjectIdGenerators;
//import com.hairbyjoyceline_marealle.hairbusiness.enums.AppointmentStatus;
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.io.Serializable;
//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.util.List;
//import java.util.Objects;
//
//
//@Entity
//@Table (name = "appointments", schema = "hair_business")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
//@Builder
//
//public class Appointment implements Serializable {
//  @Id
//  @GeneratedValue (strategy = GenerationType.IDENTITY)
//    private Long appointment_id ;
//
//  @Column(nullable = false)
//    private LocalDate appointment_date;
//
//  @Column(nullable = false)
//    private LocalTime appointment_time;
//
//  @Enumerated(EnumType.STRING)
//    private AppointmentStatus appointmentStatus;
//
//    @ManyToOne( cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    @JoinColumn(name = "customer_id")
//    private Customer customer;
//
//  @ManyToMany (cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//  @JoinTable(
//          name = "appointment_service",
//          joinColumns = @JoinColumn (name = "appointment_id"),
//          inverseJoinColumns = @JoinColumn (name = "hairStyle_id"))
//    private List<HairStyle> hairStyles;
//
//
//
//}
