
package hospital;

import java.util.Scanner;

public class AddPatient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Add Patient ===");
        System.out.print("Patient ID: ");
        String id = sc.nextLine().trim();

        System.out.print("Name: ");
        String name = sc.nextLine().trim();

        System.out.print("Age: ");
        int age = sc.nextInt(); sc.nextLine();

        System.out.print("Phone: ");
        String phone = sc.nextLine().trim();

        System.out.print("Address: ");
        String address = sc.nextLine().trim();

        if (id.isEmpty() || name.isEmpty()) {
            System.out.println("Invalid input! Patient ID and Name are required.");
        } else {
            Patient p = new Patient(id, name, age, phone, address);
            System.out.println("Patient added successfully!");
            System.out.println(p);
        }

        sc.close();
    }
}
