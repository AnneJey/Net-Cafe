/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.cafe;

import java.util.Scanner;

public class Customer {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    }
    static void customerMenu() {
        boolean loggedIn = true;

        while (loggedIn) {
            System.out.println("\n===== STAFF MENU =====");

            System.out.println("1. View Available Computers");
            System.out.println("2. Start Session");
            System.out.println("3. My Session and Bill");
            System.out.println("4. Request Assistance");
            System.out.println("0. Logout");
            
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            
            switch (choice){
                case 1:
                    System.out.println("Opening Available Computers... \n");
                    compMenu.compManage();
                    break;
                case 2:
                    System.out.println("Opening Start Session... \n");
                    break;
                case 3:
                    System.out.println("Opening My Session and Bill... \n");
                    break;
                case 4:
                    System.out.println("Opening Request Assistance... \n");
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
    