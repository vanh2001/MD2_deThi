package model;

public class PhoneBook {
    private String contactGroup;
    private String nameContact;
    private String phoneNumber;
    private boolean gender;
    private String address;
    private String email;

    public PhoneBook() {
    }

    public PhoneBook(String contactGroup, String nameContact, String phoneNumber, boolean gender, String address, String email) {
        this.contactGroup = contactGroup;
        this.nameContact = nameContact;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.address = address;
        this.email = email;
    }

    public String getContactGroup() {
        return contactGroup;
    }

    public void setContactGroup(String contactGroup) {
        this.contactGroup = contactGroup;
    }

    public String getNameContact() {
        return nameContact;
    }

    public void setNameContact(String nameContact) {
        this.nameContact = nameContact;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "phoneBook {" +
                "contactGroup='" + contactGroup + '\'' +
                ", nameContact='" + nameContact + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
