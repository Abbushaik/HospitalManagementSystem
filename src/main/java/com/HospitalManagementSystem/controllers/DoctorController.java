package com.HospitalManagementSystem.controllers;

import com.HospitalManagementSystem.Models.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctor")
public class DoctorController
{

    @GetMapping
    public List<Doctor> getAllDoctors()
    {
        return null;
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor )
    {
        System.out.println("Created Doctor");
        return null;
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable long id)
    {
        System.out.println("Getting doctor by Id...");
        return null;
    }

    @PutMapping ("/{id}")
    public void updateDoctor(@PathVariable Long id)
    {
        System.out.println("Updating doctor record...");
    }

    @DeleteMapping("/{id}")
    public void deleteDoctorById(@PathVariable Long id)
    {
        System.out.println("Deleting by id...");
    }
}
