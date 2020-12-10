package com.domänobjekt;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

    public class ContactBookTest {
        @Test
        void deleteContact_thenVerifyContactIsDeleted() {
            Contact contact1 = new Contact("Mia", "031-000001");
            Contact contact2 = new Contact("Klaus", "031-000002");
            Contact contact3 = new Contact("Vera", "031-000003");

            ContactBook contactBook = new ContactBook();
            contactBook.addNewContact(contact1);
            contactBook.addNewContact(contact2);
            contactBook.addNewContact(contact3);
            contactBook.removeContact(contact2.getName());
            ArrayList<Contact> foundContacts = contactBook.getListOfContacts();
            assertEquals(2, foundContacts.size());
        }

        @Test
        void addContact_thenVerifyContactIsAdded(){
            Contact contact4 = new Contact("Linus", "031-000004");
            Contact contact5 = new Contact("Sofia", "031-000005");
            Contact contact6 = new Contact("Hasse", "031-000006");

            ContactBook contactBook = new ContactBook();
            contactBook.addNewContact(contact4);
            contactBook.addNewContact(contact5);
            contactBook.addNewContact(contact6);
            ArrayList<Contact> foundContacts = contactBook.getListOfContacts();
            assertNotEquals(4, foundContacts.size());
        }

        @Test
        void search_thenVerifyContactIsFound(){
            Contact contact1 = new Contact("Moa", "123456678");
            Contact contact2 = new Contact("Kayca", "234456");
            Contact contact3 = new Contact("Fanny", "4534534534");

            ContactBook contactBook = new ContactBook();

            contactBook.addNewContact(contact1);
            contactBook.addNewContact(contact2);
            contactBook.addNewContact(contact3);

            contactBook.queryContact(contact3.getName());

            assertTrue(contactBook.queryContact(contact3.getName()));
        }

        @Test
        void printContact_thenVerifyContactIsPrinted() {
            Contact contact1 = new Contact("Kalle", "031-000000");
            ContactBook contactBook = new ContactBook();
            contactBook.addNewContact(contact1);
            contactBook.printContact();
            ArrayList<Contact> foundContacts = contactBook.getListOfContacts();
            assertEquals("Kalle",contactBook.printContact());
        }
    }