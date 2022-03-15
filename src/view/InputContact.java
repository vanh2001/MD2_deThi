package view;

import controller.PhoneBookManager;
import controller.Validate;
import model.PhoneBook;

import java.util.List;
import java.util.Scanner;

public class InputContact {
    private static List<PhoneBook> phoneBookListClient = PhoneBookManager.phoneBookList;
    public static Validate valid = new Validate();

    public static void phoneBooks (){
        PhoneBook p1 = new PhoneBook("Bạn", "Lê Hải Sơn", "0966061882", true, "TB", "leson@gmail.com");
        PhoneBook p2 = new PhoneBook("Bạn", "Bùi Hoàng Nam", "0944414186", true, "TB", "buinam@gmail.com");
        PhoneBook p3 = new PhoneBook("Bạn đại học", "Nguyễn Công Quân", "0986308508", true, "HP", "congquan@gmail.com");
        PhoneBook p4 = new PhoneBook("Bạn đại học", "Nguyễn Văn Lương", "0836298695", true, "TH", "vanluong@gmail.com");
        PhoneBook p5 = new PhoneBook("Bạn", "Hoàng Thanh Trúc", "0941900498", false, "NB", "thanhtruc@gmail.com");

        PhoneBookManager.addNewContact(p1);
        PhoneBookManager.addNewContact(p2);
        PhoneBookManager.addNewContact(p3);
        PhoneBookManager.addNewContact(p4);
        PhoneBookManager.addNewContact(p5);
    }

    public static PhoneBook createNewContact(){
        System.out.print("Input the Contact Group: ");
        String group = valid.checkNullString();

        System.out.print("Input the Name Contact: ");
        String name = valid.checkNullString();

        System.out.print("Input the Phone Number: ");
        String phoneNumber = valid.checkPhoneNumber();

        System.out.print("Input the gender: ");
        boolean gender = valid.checkGender();

        System.out.print("Input the address: ");
        String address = valid.checkNullString();

        System.out.print("Input the email: ");
        String email = valid.checkEmail();

        PhoneBook p = new PhoneBook(group, name, phoneNumber, gender, address, email);
        return p;
    }

    public static void editContactByIndex(){
        System.out.print("Input the phone number: ");
        String phoneNumber = valid.checkNullString();
        int check = -1;
        if(PhoneBookManager.getIndexByPhoneNumber(phoneNumber) == check){
            System.out.println("Can not find the contact!");
        }else {
            int index = PhoneBookManager.getIndexByPhoneNumber(phoneNumber);
            if(phoneBookListClient.get(index) instanceof PhoneBook){
                System.out.println("Editting the contact... ");
                System.out.println("Edit the group: " + "(" + phoneBookListClient.get(index).getContactGroup() + ")");
                String editGroup = valid.checkNullString();

                System.out.println("Edit the name: " + "(" + phoneBookListClient.get(index).getNameContact() + ")");
                String editName = valid.checkNullString();

                System.out.println("Edit the phone number: " + "(" + phoneBookListClient.get(index).getPhoneNumber() + ")");
                String editPhoneNumber = valid.checkPhoneNumber();

                System.out.println("Edit the gender: " + "(" + phoneBookListClient.get(index).isGender() + ")");
                boolean editGender = valid.checkGender();

                System.out.println("Edit the address: " + "(" + phoneBookListClient.get(index).getAddress() + ")");
                String editAddress = valid.checkNullString();

                System.out.println("Edit the email: " + "(" + phoneBookListClient.get(index).getEmail() + ")");
                String editEmail = valid.checkEmail();

                PhoneBook p = new PhoneBook(editGroup, editName, editPhoneNumber, editGender, editAddress, editEmail);
                PhoneBookManager.editContactByIndex(index, p);
            }
        }
    }

    public static void deleteByIndex(){
        System.out.print("Input the phone number: ");
        String phoneNumber = valid.checkNullString();
        int index = PhoneBookManager.getIndexByPhoneNumber(phoneNumber);
        while (true){
            if(index == -1) {
                System.out.println("Don't have a contact to remove");
                break;
            }else {
                PhoneBookManager.deleteContactByIndex(index);
                break;
            }
        }

    }

    public static void findByIndex(){
        System.out.print("Input the phone number: ");
        String phoneNumber = valid.checkNullString();
        int index = PhoneBookManager.getIndexByPhoneNumber(phoneNumber);
        while (true){
            if(index == -1){
                System.out.println("Don't have a contact to find");
                break;
            }else {
                System.out.println(phoneBookListClient.get(index));
                break;
            }
        }
    }
}
