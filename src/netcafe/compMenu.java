/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.cafe;
import java.util.*;

public class compMenu {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    }
    static void compManage() {
        System.out.println("=== Computer Management ===");
        System.out.println("1. View All Computers");
        System.out.println("2. Search Computers By ID");
        
        System.out.print("Enter choice: ");
        String choice = sc.nextLine();
        
        if (choice.equals("1")){
            System.out.println("\nOpening View All Computers...\n");
            allComp.viewAllcomp();
        } else if (choice.equals("2")){
            System.out.println("\nOpening View All Computers...\n");
            allComp.searchComp();
        }
    } 
    
}
