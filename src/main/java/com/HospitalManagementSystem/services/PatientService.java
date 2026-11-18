package com.HospitalManagementSystem.services;

import com.HospitalManagementSystem.Models.Patient;
import com.HospitalManagementSystem.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService
{

    @Autowired
    PatientRepository patientRepository;

    public List<Patient> getAllPatients()
    {
        return patientRepository.findAll();
    }

    public Patient createPatient(Patient patient)
    {
        return patientRepository.save(patient);
    }

    public Optional<Patient> getPatientById(Long id)
    {
        return patientRepository.findById(id);
    }

    public void updatePatientByID(Long id)
    {
        Optional<Patient> patient = patientRepository.findById(id);
        if(patient.isPresent())
        {
            Patient p = patient.get();
            p.setName("Abubackar");
        }
        else
        {
            System.out.println("Patient Not Found...");
        }
    }
    public void deletePatientByID(Long id)
    {
        Optional<Patient> patient = patientRepository.findById(id);
        if(patient.isPresent())
        {
            patientRepository.deleteById(id);
        }
        else
        {
            System.out.println("Patient Not Found...");
        }
    }
}
