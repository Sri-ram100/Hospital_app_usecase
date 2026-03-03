package hospital;
import java.util.Scanner;

class Doctor {
    String doctorId;
    String name;
    String specialization;
    String phone;

    public Doctor(String doctorId, String name, String specialization, String phone) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Doctor{id='" + doctorId + "', name='" + name + "', specialization='" +
               specialization + "', phone='" + phone + "'}";
    }
}

public class AddDoctorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Add Doctor ===");
        System.out.print("Doctor ID: ");
        String id = sc.nextLine().trim();

        System.out.print("Name: ");
        String name = sc.nextLine().trim();

        System.out.print("Specialization: ");
        String spec = sc.nextLine().trim();

        System.out.print("Phone: ");
        String phone = sc.nextLine().trim();

        Doctor d = new Doctor(id, name, spec, phone);

        System.out.println("Doctor added successfully!");
        System.out.println(d);

        sc.close();
    }
}