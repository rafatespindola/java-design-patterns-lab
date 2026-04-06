package br.com;

public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient("Rafael", "rafael@email.com");

        Handler nameValidation = new NameValidationHandler();
        Handler emailRequiredValidation = new EmailRequiredValidationHandler();
        Handler emailFormatValidation = new EmailFormatValidationHandler();

        nameValidation
                .setNext(emailRequiredValidation)
                .setNext(emailFormatValidation);

        nameValidation.handle(patient);

        System.out.println("Paciente validado com sucesso");
    }
}