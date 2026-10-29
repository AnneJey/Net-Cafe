/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.cafe;

import java.util.Scanner;

/**
 *
 * @author MY PC
 */
public class Staff {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    }
    static void staffMenu() {
        boolean loggedIn = true;

        while (loggedIn) {
            System.out.println("\n===== STAFF MENU =====");

            System.out.println("1. Manage Computers");
            System.out.println("2. Start and End Session");
            System.out.println("3. Process Payments");
            System.out.println("4. Manage Customers");
            System.out.println("5. Transaction History");
            System.out.println("6. Help Assistant");
            System.out.println("0. Logout");
            
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            
            switch (choice){
                case 1:
                    System.out.println("Opening Computer Management... \n");
                    compMenu.compManage();
                    break;
                case 2:
                    System.out.println("Opening Start and End Session... \n");
                    break;
                case 3:
                    System.out.println("Opening Process Payments... \n");
                    break;
                case 4:
                    System.out.println("Opening Manage Customers... \n");
                    break;
                case 5:
                    System.out.println("Opening Transaction History... \n");
                    break;
                case 6:
                    System.out.println("Opening Help Assistant... \n");
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
    