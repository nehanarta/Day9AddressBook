package com.bridglabz;
import java.util.Scanner;

public class AddressBook {
    Scanner sc=new Scanner(System.in);
    ContactDetails contact;
    public AddressBook(){
        this.contact=contact;
    }
    public void Add_Contact(){
        System.out.println("Enter the Contact Details");
        System.out.println("Enter the first name");
         String firstName=sc.next();
        System.out.println("Enter the last name");
        String LastName=sc.next();
        System.out.println("Enter the Address");
        String Address=sc.next();
        System.out.println("Enter the City");
        String city=sc.next();
        System.out.println("Enter the state");
        String state=sc.next();
        System.out.println("Enter the Zip");
        long Zip=sc.nextLong();
        System.out.println("Enter the phoenNumber");
        long phoneNum=sc.nextLong();
        System.out.println("Enter the emial");
        String Email=sc.next();
        contact=new ContactDetails(firstName,LastName,Address,city,state,Zip,phoneNum,Email);


    }
}
