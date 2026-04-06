package facade;


public class Main {
    public static void main(String[] args) {
        AppointmentFacade appointmentFacade = new AppointmentFacade();

        appointmentFacade.scheduleAppointment("Rafael", "2026-04-10 14:00", "123.456.789-87");
    }
}
