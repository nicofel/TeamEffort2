package com.domänobjekt;

public class Favourite extends Contact{
    private String email;

    public Favourite(String name, String phoneNumber, String email){
        super(name,phoneNumber);
        this.email =email;
    }
    public String getEmail(){return email;}
}

