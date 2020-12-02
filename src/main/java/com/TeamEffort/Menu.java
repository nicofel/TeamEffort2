package com.TeamEffort;

import com.domänobjekt.ContactBook;
import com.domänobjekt.Favourite;

import java.util.Scanner;

public class Menu {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean quit = false;
        printMenu();
        while (!quit) {
            System.out.println("Welcome to TeamEfforts contact list");
            int input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1:
                    ContactBook.queryContact();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    ContactBook.printContact();
                    break;
                case 4:
                    ContactBook.removeContact();
                    break;
                case 5:
                    addFavourite();
                    break;
                case 6:
                    showFavourite();
                    break;
                case 7:
                    contactBook.deleteFavourite();
                    break;
                case 8:
                    printMenu();
                    break;
                case 9:
                    System.out.println("Exiting");
                    quit = true;
                    break;
            }
        }
    }

        private static void printMenu() {
            System.out.println("\nVälj\n");
            System.out.println(
                    "1 - Search for a friend\n" +
                            "2 - Add new friend\n" +
                            "3 - Show your friends list\n" +
                            "4 - Delete a friend\n" +
                            "5 - Show the menu again\n");
        }

    private static void addNewContact() {
        System.out.println("Skriv in namnet på din kontakt: ");
        String name = scanner.nextLine();
        System.out.println("Skriv in telefonnummer till din kontakt: ");
        String phone = scanner.nextLine();
        System.out.println("Skriv in email adress för din kontakt: ");
        String email= scanner.nextLine();
        Favourite newContact = new Favourite(name, phone, email);
        if(ContactBook.addNewContact(newContact)) {
            System.out.println("Ny kontakt tillagd: Namn: " + name + ", Telefon: "+ phone);
        } else {
            System.out.println("Kan inte lägga till, " + name + " finns redan.");
        }
    }

}
