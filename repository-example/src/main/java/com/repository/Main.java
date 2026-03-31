package com.repository;

public class Main {
    public static void main(String[] args) {

        PatientRepository repository = new com.repository.InMemoryPatientRepository();
        PatientService service = new PatientService(repository);

        service.registerPatient(new Patient(1L, "Rafael", "rafael@email.com"));
        service.registerPatient(new Patient(2L, "Maria", "maria@email.com"));

        System.out.println("Lista de pacientes:");
        service.listPatients().forEach(System.out::println);

        System.out.println("\nBuscando paciente por ID:");
        System.out.println(service.findPatientById(1L));
    }
}