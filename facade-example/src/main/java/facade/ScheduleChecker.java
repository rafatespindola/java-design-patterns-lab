package facade;

public class ScheduleChecker {
    public boolean isAvailable(String dateTime) {
        return dateTime != null && !dateTime.isBlank();
    }
}
