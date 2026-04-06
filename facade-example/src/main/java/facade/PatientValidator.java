package facade;

public class PatientValidator {
    public boolean isValid(String patientName) {
        return patientName != null && !patientName.isBlank();
    }

    public boolean isCpfAvailable(String cpf) {
        return new AppointmentRepository().isCpfAvailable(cpf);
    }
}
