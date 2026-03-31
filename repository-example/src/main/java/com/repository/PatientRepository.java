package com.repository;

import java.util.List;
import java.util.Optional;

public interface PatientRepository {
    void save(Patient patient);
    List<Patient> findAll();
    Optional<Patient> findById(Long id);
}
