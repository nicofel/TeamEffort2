package com.domänobjekt;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

    public class ContactBookTest {
        @Test
        public void testDeleteContact_thenVerifyContactIsDeleted() {
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
        public void testAddContact_thenVerifyContactIsAdded(){
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
        public void testSearch_thenVerifyContactIsFound(){
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
        public void testPrintContact_thenVerifyContactIsPrinted() {
            Contact contact1 = new Contact("Kalle", "031-000000");
            ContactBook contactBook = new ContactBook();
            contactBook.addNewContact(contact1);
            contactBook.printContact();
            ArrayList<Contact> foundContacts = contactBook.getListOfContacts();
            assertEquals("Kalle",contactBook.printContact());
        }

        @Test
        public void testAddFavourite_thenVerifyFavouriteIsAdded(){
            Contact contact7 = new Contact("Mia", "031-000004");
            Contact contact8 = new Contact("Carl", "031-000005");
            Contact contact9 = new Contact("Hans", "031-000006");

            ContactBook contactBook = new ContactBook();
            contactBook.addFavourite(contact7.getName());
            contactBook.addFavourite(contact8.getName());
            contactBook.addFavourite(contact9.getName());

            List<Contact> addedFavourites = new ArrayList<>();
            addedFavourites.add(contact7);
            addedFavourites.add(contact8);
            addedFavourites.add(contact9);
            List<Contact> foundContacts = contactBook.getListOfFavourites();
            assertEquals(3, addedFavourites.size());
        }

    }