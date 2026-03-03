package hospital;
import java.util.Scanner;

public class GenerateBillApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Generate Bill ===");

        double consultation = readAmount(sc, "Consultation Charges (₹): ");
        double lab          = readAmount(sc, "Lab Test Charges (₹): ");
        double room         = readAmount(sc, "Room/Bed Charges (₹): ");

        double subtotal = consultation + lab + room;

 

        double total = subtotal;           // + gst

        System.out.println("\n----- Bill Summary -----");
        System.out.printf("Consultation: ₹%.2f%n", consultation);
        System.out.printf("Lab Tests   : ₹%.2f%n", lab);
        System.out.printf("Room/Bed    : ₹%.2f%n", room);
        System.out.println("------------------------");
        System.out.printf("Total       : ₹%.2f%n", total);

        sc.close();
    }

    private static double readAmount(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine().trim();
            try {
                double val = Double.parseDouble(input);
                if (val < 0) {
                    System.out.println("Amount cannot be negative. Try again.");
                } else {
                    return val;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number (e.g., 500 or 1200.50).");
            }
        }
    }
}