package facade;

public class AppointmentFacade {

    private final PatientValidator patientValidator;
    private final ScheduleChecker scheduleChecker;
    private final AppointmentRepository appointmentRepository;
    private final NotificationService notificationService;

    public AppointmentFacade() {
        this.patientValidator = new PatientValidator();
        this.scheduleChecker = new ScheduleChecker();
        this.appointmentRepository = new AppointmentRepository();
        this.notificationService = new NotificationService();
    }

    public void scheduleAppointment(String patientName, String dateTime, String cpf) {
        if (!patientValidator.isValid(patientName)) {
            throw new IllegalArgumentException("Paciente inválido");
        }

        if (!scheduleChecker.isAvailable(dateTime)) {
            throw new IllegalArgumentException("Horário indisponível");
        }

        if (!patientValidator.isCpfAvailable(cpf)) {
            throw new IllegalArgumentException("CPF já existente na base");
        }

        appointmentRepository.save(patientName, dateTime);
        notificationService.sendConfirmation(patientName);

        System.out.println("Agendamento concluído com sucesso");
    }
}
