package com.HospitalManagementSystem.repositories;

import com.HospitalManagementSystem.Models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
