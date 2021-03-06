package com.domänobjekt;

import java.util.ArrayList;

public class ContactBook {
    private String phoneNumber;
    private ArrayList<Contact> memberContact;
    private ArrayList<Contact> favouriteContact;
    public ArrayList getListOfFavourites() {return favouriteContact;}
    public ArrayList getListOfContacts() {return memberContact;}

    public ContactBook() {
        this.phoneNumber = phoneNumber;
        this.memberContact = new ArrayList<Contact>();
        this.favouriteContact =new ArrayList<Contact>();
    }
    public boolean addNewContact(Contact contact) {
        if(searchContact(contact.getName())>=0){
            System.out.println("This contact already exists in the system");
            return false;
        }
        memberContact.add(contact);
        return true;
    }

    private void removeContact(int position) {
        memberContact.remove(position);
    }
    public void removeContact(String item) {
        int position = searchContact(item);
        if(position >= 0) {
            removeContact(position);
            //System.out.println("Contact removed");
        }
        else{
            System.out.println("Contact is not in your contactbook");
        }
    }
    private int searchContact(Contact contact) {return  this.memberContact.indexOf(contact);}
    private int searchContact(String contactName){
        for(int i=0; i<this.memberContact.size(); i++){
            Contact contact = this.memberContact.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
    public boolean queryContact(String name){
        int position = searchContact(name);
        if(position >= 0) {
            return true;
        }
        return false;
    }
    public String printContact() {
        System.out.println("Contact list: ");
        String print = "";
        for (int i=0; i<this.memberContact.size(); i++){
            System.out.println((i+1) + " " + this.memberContact.get(i).getName() + "'s mobile number: " + this.memberContact.get(i).getPhoneNumber());
            print = this.memberContact.get(i).getName();
        }
        return print;
    }
    public void addFavourite(String favouriteContactName){
        for(int i = 0; i < this.memberContact.size(); i++){
            Contact newFavouriteContact = this.memberContact.get(i);

            if(newFavouriteContact.getName().equals(favouriteContactName)){
                favouriteContact.add(newFavouriteContact);
                System.out.println("Contact" + newFavouriteContact.getName() + "" +
                        "added in favourites.");
            }
        }
    }
    public void printFavouriteContact(){
        System.out.println("Favourite contacts: ");
        for(int i = 0; i < favouriteContact.size(); i++){
            System.out.println((i + 1) + "." + this.favouriteContact.get(i).getName() +
                    ": " + "\tMobile number: " + this.favouriteContact.get(i).getPhoneNumber());
        }
    }

}

