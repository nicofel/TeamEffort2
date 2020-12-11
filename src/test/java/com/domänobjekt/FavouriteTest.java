package com.domänobjekt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FavouriteTest {

    @Test
    void testTestFavouriteNotNull(){
        Favourite TestFavourite = new Favourite("name","phoneNumber","Email");
        assertNotNull(TestFavourite);
    }

}