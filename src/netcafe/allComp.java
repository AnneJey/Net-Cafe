package net.cafe;
import java.util.*;
import java.io.*;

public class allComp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    }
//==================================================================================================
    static void searchViewAll() {
        System.out.println("=================================");
        System.out.println("   Search / View All Computers");
        System.out.println("=================================");
        System.out.println("1. View All Computers");
        System.out.println("2. Search Computer by ID");
        System.out.println("0. Back");
        System.out.println("---");
        
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            if (choice == 1 || choice == 1.){
                viewAll();
            } else if (choice == 2 || choice == 2.){
                searchComp();
            } else if (choice == 0 || choice == 0.){
                compMenu.compManage();
            } else {
                System.out.println("Invalid choice.");
        }
    }
//==================================================================================================
    static void viewAll() {
        System.out.println("========================");
        System.out.println("   View All Computers");
        System.out.println("========================");
        
        File file = new File("computer.txt");
        
        try {
            if (file.createNewFile()) {
                // computer.txt file exist
            }
            
            Scanner reader = new Scanner(file);
            
            System.out.printf("%-10s %-15s %s%n",
                    "ID", "Rate/Hour", "Status");
            System.out.println("_____________________");

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] data = line.split(",");

            if (data.length == 3) {
                System.out.printf("%-10s %-15s %s%n",
                        data[0], data[1], data[2]);
                    }
                }
            
            System.out.println("=====================");
            System.out.println("0. Back");
            System.out.println("---");
            
            boolean validChoice = false;
            while (!validChoice) {
                System.out.print("Enter your choice: ");
                String choice = sc.nextLine();
                
                if (choice.equals("0")) {
                    validChoice = true;
                    System.out.println("\nGoing back to Search / View All Computers...\n");
                      allComp.searchViewAll();
                } else {
                    System.out.println("Invalid choice!");
                }
            }
            
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
//==================================================================================================
        static void searchComp() { // Not Done
        File file = new File("computer.txt");
        
        try {
            if (file.createNewFile()) {
                // computer.txt file exist
            }
            
            Scanner reader = new Scanner(file);
        
        
        boolean searchAgain = true;
        
        while (searchAgain) {
            System.out.println("===========================");
            System.out.println("   Search Computer by ID");
            System.out.println("===========================");

            System.out.print("Enter Computer ID: ");
            String searchID = sc.nextLine().trim();
            
            if (searchID.isEmpty()) {
                System.out.println("Computer ID cannot be empty!");
                continue;
            }
                
                boolean found = false;
                
                try {
                    Scanner reader = new Scanner(file);
                    
                    while (reader.hasNextLine()) {
                        String line = reader.nextLine().trim();
                
                        if (line.isEmpty()) {
                            continue;
                        }

                        String[] data = line.split(",", -1);

                        if (data.length == 3 &&
                            data[0].trim().equals(searchID)) {

                        System.out.println("\nComputer Found!");
                        System.out.println("===========================");
                        System.out.println("ID: " + data[0].trim());
                        System.out.println("Hourly Rate: ₱" + data[1].trim());
                        System.out.println("Status: " + data[2].trim());
                        found = true;
                        break;
                    }
                }
                    
            } catch (IOException e) {
                System.out.println("Error");
                return;
            }
                
            if (!found) {
                System.out.println("\nComputer ID not found!");
            }

            System.out.println("===========================");
            System.out.println("1. Search Again");
            System.out.println("0. Back to Search / View All Computers");
            System.out.println("---");
            
            while (true) {
                System.out.print("Enter your choice: ");
                String choice = sc.nextLine().trim();

                if (choice.equals("1")) {
                    break;
                } else if (choice.equals("0")) {
                    searchAgain = false;
                    System.out.println("\nGoing back to Computer Management...\n"
                    );
                    compMenu.compManage();
                    return;
                } else {
                    System.out.println("Invalid choice! Please try again.");
                }
            }
        }
    }
//==================================================================================================
    static void addComp() {
    }
    
    static void removeComp() {
    }
    
    static void hourlyRate() {
    }
    
    static void status() {
    }
}
