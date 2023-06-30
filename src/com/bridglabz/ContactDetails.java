package com.bridglabz;
public class ContactDetails {
    private String FirstName;
    private String LastName;
    private String address;
    private String city;
    private String state;
    private long Zip;
    private long phoneNo;
    private String email;

    public ContactDetails(String firstName, String lastName, String address, String city,
                          String state, long zip, long phoneNo, String email) {
        FirstName = firstName;
        LastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.Zip = zip;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", Zip=" + Zip +
                ", phoneNo=" + phoneNo +
                ", email='" + email + '\'' +
                '}';
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZip() {
        return Zip;
    }

    public void setZip(long zip) {
        Zip = zip;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
