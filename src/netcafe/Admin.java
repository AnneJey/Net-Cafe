package net.cafe;
import java.util.*;

public class Admin {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        adminMenu();
    }
    static void adminMenu() {
        boolean loggedIn = true;

        while (loggedIn) {
            System.out.println("\n===== ADMIN MENU =====");
            System.out.println("1. Manage Computers");
            System.out.println("2. Manage Users");
            System.out.println("3. View Sessions");
            System.out.println("4. Sales Report");
            System.out.println("0. Logout");
            
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            
            switch (choice){
                case 1:
                    System.out.println("Opening Computer Management... \n");
                    compMenu.compManage();
                    break;
                case 2:
                    System.out.println("Opening Users Management... \n");
                    break;
                case 3:
                    System.out.println("Opening View Sessions... \n");
                    break;
                case 4:
                    System.out.println("Opening Sales Report... \n");
                    break;
                case 0:
                    System.out.println("Opening Log Out Menu... \n");
                    NetCafe.logIn();
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.\n");   
            }
        }
    }
}
