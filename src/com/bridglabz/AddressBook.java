package com.bridglabz;
import java.util.Scanner;

public class AddressBook {
    Scanner sc=new Scanner(System.in);
    ContactDetails contact;
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
        public void editContact(){
            System.out.print("Enter the contact first name to edit:");
            String editContactName = sc.next();

            if(contact.getFirstName().equals(editContactName)){
                System.out.println("contact found");

                System.out.println("Before editing...");
                System.out.println(contact.toString());

                //Edit different fields
                System.out.print("Enter the Last Name:");
                String lastName = sc.next();
                contact.setLastName(lastName);
                System.out.print("Enter the Address:");
                String address = sc.next();
                contact.setAddress(address);
                System.out.print("Enter the City Name:");
                String cityName = sc.next();
                contact.setCity(cityName);
                System.out.print("Enter the State Name:");
                String stateName = sc.next();
                contact.setState(stateName);
                System.out.print("Enter the Zip Code:");
                int zipCode = sc.nextInt();
                contact.setZip(zipCode);
                System.out.print("Enter the Phone Number:");
                long phoneNumber = sc.nextLong();
                contact.setPhoneNo(phoneNumber);
                System.out.print("Enter the Email ID:");
                String email = sc.next();
                contact.setEmail(email);

                System.out.println("After editing...");
                System.out.println(contact.toString());
            }else{
                System.out.println("contact not found");
            }
        }
    }


