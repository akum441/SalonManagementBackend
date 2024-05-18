package com.salon.SalonManagement.repository;


import com.salon.SalonManagement.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
