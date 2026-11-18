package com.HospitalManagementSystem.controllers;

import com.HospitalManagementSystem.Models.Patient;
import com.HospitalManagementSystem.services.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController
{

    PatientService patientService;
    PatientController(PatientService patientService)
    {
        this.patientService = patientService;
    }

    @GetMapping("")
    public List<Patient> getAllPatients()
    {
        return patientService.getAllPatients();
    }


    @PostMapping
    public Patient createPatient(@RequestBody Patient patient)
    {
        return patientService.createPatient(patient);
    }

    @GetMapping("/{id}")
    public Optional<Patient> getPatientById(@PathVariable Long id)
    {
        return patientService.getPatientById(id);
    }

    @PutMapping("/{id}")
    public void updatePatientById(@PathVariable Long id)
    {
        System.out.println("Updating Patient ");
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id)
    {
        System.out.println("Deleted Patient By ID");
    }
}
