package com.domänobjekt;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

    public class ContactBookTest {
        @Test
        void deleteContact_thenVerifyContactIsDeleted() {
            // Skapa tre kontakter
            Contact contact1 = new Contact("Kalle", "kalle@ankeborg.com");
            Contact contact2 = new Contact("Kajsa", "kajsa@ankeborg.com");
            Contact contact3 = new Contact("Klarabella", "klarabella@ankeborg.com");
            // Spara dessa tre kontakter till ContactBook
            ContactBook contactBook = new ContactBook();
            contactBook.addNewContact(contact1);
            contactBook.addNewContact(contact2);
            contactBook.addNewContact(contact3);
            contactBook.removeContact(contact2.getName());
            ArrayList<Contact> foundContacts = contactBook.getListOfContacts();
            assertEquals(2, foundContacts.size());
        }
    }