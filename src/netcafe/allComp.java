/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.cafe;
import java.util.*;
import java.io.*;

public class allComp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    }
        
    static void viewAllcomp() {
        System.out.println("================================================================");
        System.out.println("                     All Computers");
        System.out.println("================================================================");

        File file = new File("computers.txt");

        try {
            if (file.createNewFile()) {
                
            }

            Scanner reader = new Scanner(file);
            
            System.out.printf("%-10s %-15s %-15s %s%n",
                    "ID", "Name", "Rate/Hour", "Status");

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] data = line.split(",");

            if (data.length == 4) {
                System.out.printf("%-10s %-15s %-15s %s%n",
                        data[0], data[1], data[2], data[3]);
                    }
                }
            
            System.out.println("================================================================");
            System.out.println("0. Back to Computer Management");
            System.out.println("---");
            
            boolean validChoice = false;
            while (!validChoice) {
                System.out.print("Enter your choice: ");
                String choice = sc.nextLine();
                
                if (choice.equals("0")) {
                    validChoice = true;
                    System.out.println("\nGoing back to Computer Management...\n");
                      compMenu.compManage();
                } else {
                    System.out.println("Invalid choice!");
                }
            }
            
        } catch (IOException e) {
            System.out.println("An error occurred while accessing the file.");
        }
    }
    
    static void searchComp() {
        File file = new File("computers.txt");
        
        boolean searchAgain = true;
        
        while (searchAgain) {
            System.out.println("================================================================");
            System.out.println("                  Search Computer by ID");
            System.out.println("================================================================");

            System.out.print("Enter Computer ID: ");
            String searchID = sc.nextLine().trim();
            
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
                
                Scanner reader = new Scanner(file);
                boolean found = false;

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] data = line.split(",");

                if (data.length == 4 &&
                    data[0].trim().equalsIgnoreCase(searchID)) {

                    System.out.println("\nComputer Found!");
                    System.out.println("================================================================");
                    System.out.println("ID: " + data[0].trim());
                    System.out.println("Name: " + data[1].trim());
                    System.out.println("Hourly Rate: ₱" + data[2].trim());
                    System.out.println("Status: " + data[3].trim());
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("\nComputer ID not found!");
            }

            System.out.println("================================================================");
            System.out.println("1. Search Again");
            System.out.println("0. Back to Computer Management");
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

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            return;
        }
    }
   }
}
