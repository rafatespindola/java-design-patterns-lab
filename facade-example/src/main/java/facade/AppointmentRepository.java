package facade;

import java.util.Objects;

public class AppointmentRepository {
    public void save(String patientName, String dateTime) {
        System.out.println("Consulta salva para " + patientName + " em " + dateTime);
    }

    public boolean isCpfAvailable(String cpf) {
        if (!Objects.equals(cpf, "000.000.000-00")) {
            return true;
        } else {
            return false;
        }
    }
}
