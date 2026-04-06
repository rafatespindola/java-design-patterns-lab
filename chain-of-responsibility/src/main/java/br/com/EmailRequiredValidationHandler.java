package br.com;

public class EmailRequiredValidationHandler extends Handler {

    @Override
    public void handle(Patient patient) {
        if (patient.email() == null || patient.email().isBlank()) {
            throw new IllegalArgumentException("E-mail é obrigatório");
        }

        System.out.println("E-mail preenchido");

        if (next != null) {
            next.handle(patient);
        }
    }
}
