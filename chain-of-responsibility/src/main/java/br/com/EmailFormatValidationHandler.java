package br.com;

public class EmailFormatValidationHandler extends Handler {

    @Override
    public void handle(Patient patient) {
        if (!patient.email().contains("@")) {
            throw new IllegalArgumentException("Formato de e-mail inválido");
        }

        System.out.println("Formato de e-mail válido");

        if (next != null) {
            next.handle(patient);
        }
    }
}
