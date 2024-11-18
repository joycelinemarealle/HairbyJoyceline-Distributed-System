//package com.hairbyjoyceline_marealle.hairbusiness.entity;
//
//import com.fasterxml.jackson.annotation.JsonIdentityInfo;
//import com.fasterxml.jackson.annotation.ObjectIdGenerators;
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.io.Serializable;
//import java.util.List;
//
//
//@Entity
//@Table (name = "hairStyles", schema = "hair_business")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
//@Builder
//public class HairStyle implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long hairStyle_id;
//
//    @Column(nullable = false)
//    private String name;
//
//    @Column(nullable = false)
//    private double duration;
//
//    @Column(nullable = false)
//    private double price;
//
//    @ManyToMany(mappedBy = "hairStyles")
//    List<Appointment> appointments;
//
//
//}
