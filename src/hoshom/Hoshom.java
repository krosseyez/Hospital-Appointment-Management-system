/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hoshom;

import java.util.*;
import java.sql.Connection;

public class Hoshom {

   public static void main(String[] args) { 
 DbConnection dbConnection = new DbConnection();
        DcoAuthentication authenticator = new DcoAuthentication(dbConnection);
        
        Department icu = new Department("ICU");
Nurse nurse3 = new Nurse("Mike", "Williams", "password678", "mikewill", icu);

Nurse nurse4 = new Nurse("james", "William", "password698", "mikewill1", icu);
Department dentist = new Department("Detist");
Department cardiology = new Department("Cardiology");


Department oncology = new Department("Oncology");





           Scanner input = new Scanner(System.in);
             System.out.println("Welcome to the Hospital Management System!");

        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.println("\n1. Login\n2. Register\n3. Exit");
            System.out.print("Choose an option: ");
            int option = input.nextInt();
            input.nextLine(); 
            
             switch (option) {
                case 1:
                    System.out.print("Enter username: ");
                    String loginUsername = input.nextLine();
                    System.out.print("Enter password: ");
                    String loginPassword = input.nextLine();
                    if (authenticator.login(loginUsername, loginPassword)) {
                        loggedIn = true;
                        System.out.println("Login successful!  Welcome, " );
                        
                    } else {
                        System.out.println("Invalid username or password. Please try again.");
                    }
                    break;
                    
                      case 2:
                    System.out.print("Enter first name: ");
                    String fName = input.nextLine();
                    System.out.print("Enter last name: ");
                    String lName = input.nextLine();
                    System.out.print("Enter age: ");
                    int age = input.nextInt();
                    input.nextLine(); // Consume newline
                    System.out.print("Enter username: ");
                    String registerUsername = input.nextLine();
                    System.out.print("Enter password: ");
                    String registerPassword = input.nextLine();
                    if (authenticator.register(fName,lName, age, registerUsername, registerPassword)) {
                        System.out.println("Registration successful! You can now login.");
                    } else {
                        System.out.println("Registration failed. Please try again.");
                    }
                       break;
                case 3:
                    System.out.println("Exiting the system. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
                    break;   }
        }
}
    
}

