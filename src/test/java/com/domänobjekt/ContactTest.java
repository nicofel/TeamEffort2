package com.domänobjekt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    public void testTestContactNotNull(){
        Contact TestContact = new Contact("name","phoneNumber");
        assertNotNull(TestContact);
    }
}