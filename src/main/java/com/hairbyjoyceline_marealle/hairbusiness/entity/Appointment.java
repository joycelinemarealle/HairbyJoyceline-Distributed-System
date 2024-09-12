package com.hairbyjoyceline_marealle.hairbusiness.entity;

import com.hairbyjoyceline_marealle.hairbusiness.enums.AppointmentStatus;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

@Entity
public class Appointment implements Serializable {
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long appt_id ;

    private LocalDate appt_date;
    private LocalTime appt_time;
    private String style;
    private AppointmentStatus appointmentStatus;

    @ManyToOne( cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Customer customer;

  public Long getAppt_id() {
    return appt_id;
  }

  public Appointment(Long appt_id, LocalDate appt_date, LocalTime appt_time, String style, AppointmentStatus appointmentStatus, Customer customer) {
    this.appt_id = appt_id;
    this.appt_date = appt_date;
    this.appt_time = appt_time;
    this.style = style;
    this.appointmentStatus = appointmentStatus;
    this.customer = customer;
  }

  public Appointment(){

  }
  public void setAppt_id(Long appt_id) {
    this.appt_id = appt_id;
  }

  public LocalDate getAppt_date() {
    return appt_date;
  }

  public void setAppt_date(LocalDate appt_date) {
    this.appt_date = appt_date;
  }

  public LocalTime getAppt_time() {
    return appt_time;
  }

  public void setAppt_time(LocalTime appt_time) {
    this.appt_time = appt_time;
  }

  public String getStyle() {
    return style;
  }

  public void setStyle(String style) {
    this.style = style;
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
    return Objects.equals(appt_id, that.appt_id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(appt_id);
  }

  @Override
  public String toString() {
    return "Appointment{" +
            "appt_id=" + appt_id +
            ", appt_date=" + appt_date +
            ", appt_time=" + appt_time +
            ", style='" + style + '\'' +
            ", AppointmentStatus=" + appointmentStatus +
            ", customer=" + customer +
            '}';
  }
}
