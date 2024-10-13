package gla_java;

//Author: MELISSA DA ROCHA
//Roll No.: 26
//Title: Goa Legislative Assembly
//Start Date: 08-07-2024
//Modified Date:15-07-2024
//Description: Implementing Goa Legislative Assembly website in Java.(Displaying OOP Concepts)

/**
 * @author Melissa Da Rocha
 * @since 08-07-2024
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * class for the Goa Legislative Assembly
 */
public class Main
{
    private static final ArrayList<MLA> members = new ArrayList<>();  
    private static final ArrayList<Bill> bills = new ArrayList<>();  

    /**
     * Main method to start the application.
     * 
     * @param args command-line arguments
     */

    public static void main(String[] args)
    {
        members.add(new MLA("Shri.Pramod Sawant", "Sanquelim", "Bharatiya Janata Party"));  
        members.add(new MLA("Shri.Rohan Khaunte", "Porvorim","Bharatiya Janata Party"));
        members.add(new Minister("Shri.Vishwajit Rane", "Valpoi", "Bharatiya Janata Party", "Health Minister")); 
        members.add(new Minister("Shri.Mauvin Godinho", "Dabolim", "Bharatiya Janata Party", "Transport Minister"));
        bills.add(new Bill("The Water (Prevention And Control Of Pollution) Amendment Bill, 2024","12-01-2024" , "Shri.Pravin Arlekar")); 
        bills.add(new Bill("The Goa Motor Vehicles Tax (Amendment) Bill, 2024", "15-01-2024" , "Shri.Mauvin Godinho"));

        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.print("\n---------- GOA LEGISLATIVE ASSEMBLY ----------\n");

        do {
           
            System.out.println("\nEnter your choice:\n1. Display MLAs\n2. Display Council Ministers\n3. Display Bills\n4. Exit\n");
            choice = scanner.nextInt();

            /**
             * switch statement to handle the user's choice
             */
            switch (choice) {
                case 1:
                    System.out.println("\nFollowing is the list of MLAs:");
                    displayMembers();
                    break;
                case 2:
                System.out.println("\nFollowing is the list of Ministers:");
                    displayCouncilMinisters();
                    break;
                case 3:
                System.out.println("\nFollowing is the list of Bills:");
                    displayBills();
                    break;
                case 4:
                    System.out.println("\nExiting...");
                    break;
                default:
                    System.out.println("\nInvalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    /**
     * method to display list of all the MLAs
     */
    private static void displayMembers()
    {
        for (MLA member : members)
        {
            member.displayMLADetails();
            System.out.println("---------------------------");
        }
    }

    /**
     * method to display list of all the Ministers
     */
    private static void displayCouncilMinisters()
    {
        for (MLA member : members)
        {
            if (member instanceof Minister)
            {
                member.displayMLADetails();
                System.out.println("---------------------------");
            }
        }
    }

    /**
     * method to display list of all the Bills
    */ 
    private static void displayBills()
    {
        for (Bill bill : bills) {
            bill.displayDetails();
            System.out.println("---------------------------");
        }
    }
}