package com.HospitalManagementSystem.services;

import com.HospitalManagementSystem.Models.Doctor;
import com.HospitalManagementSystem.repositories.DoctorRepository;

import java.net.http.HttpClient;
import java.util.List;
import java.util.Optional;

public class DoctorService
{

    DoctorRepository doctorRepository;

    DoctorService(DoctorRepository doctorRepository)
    {
        this.doctorRepository=doctorRepository;
    }
    public List<Doctor> getAllDoctors()
    {
        return  doctorRepository.findAll();
    }

    public Doctor createDoctor(Doctor doctor)
    {
        return doctorRepository.save(doctor);
    }

    public Optional<Doctor> getDoctorById(Long id)
    {
        return doctorRepository.findById(id);
    }

    public void updateDoctor(Long id)
    {
        Optional<Doctor> doctor = doctorRepository.findById(id);
        if(doctor.isPresent())
        {
            Doctor doc = doctor.get();
            doc.setName("Abubackar");
        }
        else {
            System.out.println("Doctor not Found...");
        }
    }

    public void deleteDoctor(Long id)
    {
        Optional<Doctor> doctor = doctorRepository.findById(id);
        if(doctor.isPresent())
        {
            doctorRepository.deleteById(id);
        }
        else {
            System.out.println("Doctor not Found...");
        }
    }
}
