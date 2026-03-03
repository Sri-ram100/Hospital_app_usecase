package hospital;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.UUID;

class Appointment {
    String appointmentId;
    String patientId;
    String doctorId;
    LocalDateTime dateTime;

    public Appointment(String appointmentId, String patientId, String doctorId, LocalDateTime dateTime) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Appointment{id='" + appointmentId + "', patientId='" + patientId +
               "', doctorId='" + doctorId + "', dateTime='" + dateTime + "'}";
    }
}

public class BookAppointmentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.println("=== Book Appointment ===");

        System.out.print("Patient ID: ");
        String patientId = sc.nextLine().trim();

        System.out.print("Doctor ID: ");
        String doctorId = sc.nextLine().trim();

        System.out.print("Date & Time (yyyy-MM-dd HH:mm): ");
        String dtStr = sc.nextLine().trim();

        if (patientId.isEmpty() || doctorId.isEmpty()) {
            System.out.println("Invalid input! Patient ID and Doctor ID are required.");
            sc.close();
            return;
        }

        try {
            LocalDateTime dt = LocalDateTime.parse(dtStr, fmt);

            String apptId = "A-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();

            Appointment appt = new Appointment(apptId, patientId, doctorId, dt);
            System.out.println("Appointment booked successfully!");
            System.out.println(appt);

        } catch (DateTimeParseException e) {
            System.out.println("Invalid date/time format. Use yyyy-MM-dd HH:mm (e.g., 2026-03-05 10:30).");
        } finally {
            sc.close();
        }
    }
}