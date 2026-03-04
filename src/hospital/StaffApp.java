package hospital;
import java.util.*;

public class StaffApp {

    static class Staff {
        String id;
        String name;
        String role;

        Staff(String id, String name, String role) {
            this.id = id;
            this.name = name;
            this.role = role;
        }

        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Role: " + role;
        }
    }

    static ArrayList<Staff> staffList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n== MENU ==");
            System.out.println("1. Add Staff");
            System.out.println("2. Fetch Staff by ID");
            System.out.println("3. Display All Staff");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter Staff ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Role: ");
                    String role = sc.nextLine();

                    
                    staffList.add(new Staff(id, name, role));
                    System.out.println("Staff Added Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Staff ID to Fetch: ");
                    String searchId = sc.nextLine();

                    
                    Staff found = null;
                    for (Staff s : staffList) {
                        if (s.id.equals(searchId)) {
                            found = s;
                            break;
                        }
                    }

                    if (found != null) {
                        System.out.println("Staff Found: " + found);
                    } else {
                        System.out.println("No Staff Found with ID: " + searchId);
                    }
                    break;

                case 3:
                	System.out.println("\nALL staff.");
                	for(Staff s :staffList) {
                		System.out.println(s);
                	}
                	break;
                
                case 4:
                	System.out.println("Exiting..");
                	sc.close();
                	return;
                	
                default:
                	System.out.println("Invalid choice");
            }
        }
                	
      }
}