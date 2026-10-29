package net.cafe;
import java.util.*;

public class compMenu {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    }
    static void compManage() {
        System.out.println("=== Computer Management ===");
        System.out.println("1. Search / View All Computers");
        System.out.println("2. Add Computer");
        System.out.println("3. Remove Computer");
        System.out.println("4. Set Hourly Rate");
        System.out.println("5. Set Status");
        System.out.println("0. Back to Admin Menu");
        
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("\nOpening View All Computers...\n");
                allComp.searchViewAll();
                break;
            case 2:
                System.out.println("\nOpening Add Computer...\n");
                allComp.addComp();
                break;
            case 3:
                System.out.println("\nOpening Remove Computer...\n");
                allComp.removeComp();
            case 4:
                System.out.println("\nOpening Set Hourly Rate Computer...\n");
                allComp.hourlyRate();
            case 5:
                System.out.println("\nOpening Set Status Computer...\n");
                allComp.status();
            case 0:
                System.out.println("\nReturning to Admin Menu...\n");
                break;
            default:
                System.out.println("\nInvalid choice. Please try again.\n");
        }
    } 
}
