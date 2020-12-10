package com.TeamEffort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MenuTest {

   @BeforeAll
    public static void BeforeAll(){
        System.out.println("Starting test");
   }


@Test
    public void searchContact() {
    Assertions.assertThrows(NumberFormatException.class, () -> {
        Integer.parseInt("One");
    });
    System.out.println("The test passed");
}
       //menuTest.searchContact();
       //System.out.println("Test");

/*@Test
    void addNewContact(){
   System.out.println("Test");
}*/


}