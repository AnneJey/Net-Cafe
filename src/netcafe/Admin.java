/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.cafe;
import java.util.*;

public class Admin {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    }
    static void adminMenu() {
        boolean loggedIn = true;

        while (loggedIn) {
            System.out.println("\n===== ADMIN MENU =====");
            System.out.println("1. Computer Management");
            System.out.println("2");
            System.out.println("0. Logout");
            
            System.out.print("Enter choice: ");
            String choice = sc.nextLine();
            
            if (choice.equals("1")) {
                System.out.println("Opening Computer Management... \n");
                compMenu.compManage();
            } else if (choice.equals("2")){
                System.out.println("Opening Log Out Menu... \n");
            }
        }
    }
}
    