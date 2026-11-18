package com.HospitalManagementSystem.repositories;

import com.HospitalManagementSystem.Models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {
}
