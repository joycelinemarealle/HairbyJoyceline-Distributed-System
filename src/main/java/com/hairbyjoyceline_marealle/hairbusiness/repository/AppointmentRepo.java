package com.hairbyjoyceline_marealle.hairbusiness.repository;

import com.hairbyjoyceline_marealle.hairbusiness.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long> {
}
