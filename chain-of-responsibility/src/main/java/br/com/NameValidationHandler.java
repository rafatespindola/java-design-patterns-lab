package br.com;

public class NameValidationHandler extends Handler {

    @Override
    public void handle(Patient patient) {
        if (patient.name() == null || patient.name().isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatório");
        }

        System.out.println("Nome válido");

        if (next != null) {
            next.handle(patient);
        }
    }
}
