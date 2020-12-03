package com.TeamEffort;

import com.domänobjekt.ContactBook;
import com.domänobjekt.Favourite;

import java.util.Scanner;

public class Menu {

    private static Scanner scanner = new Scanner(System.in);
    private static ContactBook contactBook = new ContactBook();

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
                    "1 - Search for a contact\n" +
                            "2 - Add new contact\n" +
                            "3 - Show your contact list\n" +
                            "4 - Delete a contact\n" +
                            "5 - Add contact to favourite\n" +
                            "6 - Show favourites\n" +
                            "7 - Delete favourite\n" +
                            "8 - Show menu\n" +
                            "9 - Exiting");

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
    private static void addFavourite(){
        System.out.println("Who do you want to add to favourites? ");
        String favouriteContactName = scanner.nextLine();
        contactBook.addFavourite(favouriteContactName);
    }

}
