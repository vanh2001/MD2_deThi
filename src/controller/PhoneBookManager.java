package controller;

import model.PhoneBook;
import storage.IPhoneData;
import storage.PhoneFromFileBinary;

import java.io.IOException;
import java.util.ArrayList;

public class PhoneBookManager {
    public static ArrayList<PhoneBook> phoneBookList = new ArrayList<>();
    public static IPhoneData phoneData = new PhoneFromFileBinary();

    //Hiển thị danh sách:
    public static void displayAllPhoneBook(){
        for (PhoneBook contact: phoneBookList) {
            System.out.println(contact);
        }
    }

    //Thêm mới danh bạ:
    public static void addNewContact(PhoneBook phoneBook){
        phoneBookList.add(phoneBook);
        try{
            phoneData.writeFile(phoneBookList);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //Lấy chuỗi sdt ra index
    public static int getIndexByPhoneNumber(String phoneNumber){
        for (int i = 0; i < phoneBookList.size(); i++) {
            PhoneBook phoneBook = phoneBookList.get(i);
            if(phoneBook.getPhoneNumber().equals(phoneNumber)){
                return i;
            }
        }
        return -1;
    }

    //Sửa sdt theo phoneNumber
    public static void editContactByIndex(int index, PhoneBook phoneBook){
        phoneBookList.set(index, phoneBook);
        try{
            phoneData.writeFile(phoneBookList);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //Xóa sdt theo phoneNumber
    public static void deleteContactByIndex(int index){
        phoneBookList.remove(index);
        try{
            phoneData.writeFile(phoneBookList);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
