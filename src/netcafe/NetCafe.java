/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.cafe;
import java.util.*;

public class NetCafe {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    }
        static void LogIn(){
            System.out.println("==== Net Cafe Login ===");
        
            System.out.print("Enter Username: ");
            String username = sc.nextLine();
        
            System.out.print("Enter Password: ");
            String password = sc.nextLine();
        
            if (username.equals("admin")&& (password.equals("admin123"))){
                System.out.println("Login Success!");
                System.out.println("Welcome Back, Admin");
                Admin.adminMenu();
            
            } else if (username.equals("staff") && (password.equals("staff123"))){
                System.out.println("Login Success!");
            
            } else if (username.equals("customer") && (password.equals("customer123"))){
                System.out.println("Login Success!");
            } else {
                System.out.println("Invalid username or password");
            }
    } 
}