/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.cafe;
import java.util.Scanner;
import java.io.*;

public class Assistance {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    }
    
    // Customer Request Assistance
    static void requestAssistance(){
        System.out.println("========================");
        System.out.println("   REQUEST ASSISTANCE   ");
        System.out.println("========================");

        System.out.println("1. Computer Problem");
        System.out.println("2. Internet Connection Problem");
        System.out.println("3. Payment or Billing Concern");
        System.out.println("4. Request for Snacks or Drinks");
        System.out.println("5. Other Concern");
        System.out.println("0. Back to Customer Dashboard");

        System.out.println("---");
        System.out.print("Enter your choice: ");
        String choice = sc.nextLine().trim();

        if (choice.equals("0")) {
            System.out.println("Returning to Customer Dashboard...");
            Customer.customerMenu();
        }

        String reason = "";

        switch (choice) {
            case "1":
                reason = "Computer Problem";
                break;
            case "2":
                reason = "Internet Connection Problem";
                break;
            case "3":
                reason = "Payment or Billing Concern";
                break;
            case "4":
                reason = "Request for Snacks or Drinks";
                break;
            case "5":
                reason = "Other Concern";
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                return;
        }

        System.out.print("Enter Computer ID: ");
        String computerID = sc.nextLine().trim();

        System.out.print("Enter additional details: ");
        String details = sc.nextLine().trim();

        File file = new File("assistance.txt");

        try {
            FileWriter writer = new FileWriter(file, true);

            writer.write(reason + "," + computerID + "," + details + ",Pending\n");

            System.out.println("\n================================");
            System.out.println("   ASSISTANCE REQUEST SUBMITTED   ");
            System.out.println("==================================");
            System.out.println("Reason: " + reason);
            System.out.println("Computer ID: " + computerID);
            System.out.println("Status: Pending");
            System.out.println("Please wait for staff assistance.");

        } catch (IOException e) {
            System.out.println("Unable to save assistance request.");
        }
    }
    
    // Staff Manage Assistance
    static void manageAssistance() {
        System.out.println("\n==============================");
        System.out.println("   MANAGE ASSISTANCE REQUESTS   ");
        System.out.println("================================");
        System.out.println("1. View All Assistance Requests");
        System.out.println("2. View Pending Requests");
        System.out.println("3. Update Request Status");
        System.out.println("0. Back to Staff Dashboard");
        System.out.println("---");
        
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                viewRequests();
                break;
            case 2:
                viewPending();
                break;
            case 3:
                updateStatus();
                break;
            case 0:
                System.out.println("Returning to Staff Dashboard...");
                Staff.staffMenu();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    
    
    static void  viewRequests() {
        File file = new File("assistance.txt");
        
        System.out.println("\n========================================");
        System.out.println("       ALL ASSISTANCE REQUESTS");
        System.out.println("========================================");

        if (!file.exists()) {
            System.out.println("No assistance requests found.");
            manageAssistance();
            return;
        }

        boolean found = false;

        try {
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] data = line.split(",", -1);
                
                if (data.length == 4) {
                    System.out.println("Reason: " + data[0]);
                    System.out.println("Computer ID: " + data[1]);
                    System.out.println("Details: " + data[2]);
                    System.out.println("Status: " + data[3]);
                    System.out.println("----------------------------------------");

                    found = true;
                }
            }
            
            if (!found) {
                System.out.println("No assistance requests found.");
            }
        } catch (IOException e) {
            System.out.println("Unable to read assistance requests.");
        }
    }
    
    static void viewPending() {
    }
    
    static void updateStatus() {
    }
    
}
