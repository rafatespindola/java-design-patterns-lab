package com.repository;

import com.repository.Patient;
import com.repository.PatientRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryPatientRepository implements PatientRepository {

    private final List<Patient> patients = new ArrayList<>();

    @Override
    public void save(Patient patient) {
        patients.add(patient);
    }

    @Override
    public List<Patient> findAll() {
        return patients;
    }

    @Override
    public Optional<Patient> findById(Long id) {
        return patients.stream()
                .filter(patient -> patient.id().equals(id))
                .findFirst();
    }
}