package hospital;
import java.util.Scanner;

public class AllocateBedSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int generalBeds = 5;
        int privateBeds = 3;
        int icuBeds = 1;

        while (true) {

            System.out.println("\n=== Allocate Bed ===");
            System.out.println("1. GENERAL");
            System.out.println("2. PRIVATE");
            System.out.println("3. ICU");
            System.out.println("4. EXIT");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();  // FIX: clear leftover newline so pause works

            if (choice == 1) {
                if (generalBeds > 0) {
                    System.out.println("Bed allocated in GENERAL ward.");
                    generalBeds--;
                } else {
                    System.out.println("GENERAL beds not available.");
                }
            }

            if (choice == 2) {
                if (privateBeds > 0) {
                    System.out.println("Bed allocated in PRIVATE ward.");
                    privateBeds--;
                } else {
                    System.out.println("PRIVATE beds not available.");
                }
            }

            if (choice == 3) {
                if (icuBeds > 0) {
                    System.out.println("Bed allocated in ICU.");
                    icuBeds--;
                } else {
                    System.out.println("ICU beds not available.");
                }
            }

            if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }

            
            System.out.println("\nPress ENTER to continue...");
            sc.nextLine();   
        }

        sc.close();
    }
}
