package com.hairbyjoyceline_marealle.hairbusiness.entity;

import com.hairbyjoyceline_marealle.hairbusiness.enums.AppointmentStatus;
import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

@Entity
//@Table (name = "appointments", schema = "hair_booking_system")
public class Appointment implements Serializable {
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long appointment_id ;

  @Column(nullable = false)
    private LocalDate appointment_date;

  @Column(nullable = false)
    private LocalTime appointment_time;

  @Enumerated(EnumType.STRING)
    private AppointmentStatus appointmentStatus;

    @ManyToOne( cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

  @ManyToOne( cascade = CascadeType.ALL,fetch = FetchType.LAZY)
  @JoinColumn(name = "service_id")
    private HairStyle hairService;

  public Long getappointment_id() {
    return appointment_id;
  }

  public Appointment(Customer customer, HairStyle hairService, LocalDate appointment_date, LocalTime appointment_time, AppointmentStatus appointmentStatus) {
    this.appointment_date = appointment_date;
    this.appointment_time = appointment_time;
    this.appointmentStatus = appointmentStatus;
    this.customer = customer;
    this.hairService = hairService;
  }

  public Appointment(){

  }

  public HairStyle getHairService() {
    return hairService;
  }

  public void setHairService(HairStyle hairService) {
    this.hairService = hairService;
  }


  public LocalDate getappointment_date() {
    return appointment_date;
  }

  public void setappointment_date(LocalDate appointment_date) {
    this.appointment_date = appointment_date;
  }

  public LocalTime getappointment_time() {
    return appointment_time;
  }

  public void setappointment_time(LocalTime appointment_time) {
    this.appointment_time = appointment_time;
  }

  public AppointmentStatus getAppointmentStatus() {
    return appointmentStatus;
  }

  public void setAppointmentStatus(AppointmentStatus appointmentStatus) {
    this.appointmentStatus = appointmentStatus;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Appointment that = (Appointment) o;
    return Objects.equals(appointment_id, that.appointment_id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(appointment_id);
  }

  @Override
  public String toString() {
    return "Appointment{" +
            "appointment_id=" + appointment_id +
            ", appointment_date=" + appointment_date +
            ", appointment_time=" + appointment_time +
            ", AppointmentStatus=" + appointmentStatus +
            ", customer=" + customer +
            '}';
  }
}
