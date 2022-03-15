package view;

import controller.PhoneBookManager;
import controller.Validate;
import model.PhoneBook;

import java.util.List;

public class InputContact {
    private static List<PhoneBook> personListClient = PhoneBookManager.phoneBookList;
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
        System.out.println("Input the Contact Group: ");
        String group = valid.checkNullString();

        System.out.println("Input the Name Contact: ");
        String name = valid.checkNullString();

        System.out.println("Input the Phone Number: ");
        String phoneNumber = valid.checkPhoneNumber();

        System.out.println("Input the gender: ");
        boolean gender = valid.checkGender();

        System.out.println("Input the address: ");
        String address = valid.checkNullString();

        System.out.println("Input the email: ");
        String email = valid.checkEmail();

        PhoneBook p = new PhoneBook(group, name, phoneNumber, gender, address, email);
        return p;
    }

    public static void editContactById(){

    }
}
