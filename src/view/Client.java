package view;

import controller.PhoneBookManager;
import model.PhoneBook;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner inputChoice = new Scanner(System.in);
        int choice = -1;
        while (choice != 0){
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ");
            System.out.println("Chọn chức năng theo số (để tiếp tục): ");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("8. Exit");
            System.out.print("Please your choice: ");
            choice = inputChoice.nextInt();
            switch (choice){
                case 1:
                    PhoneBookManager.displayAllPhoneBook();
                    break;
                case 2:
                    PhoneBook phoneBook = InputContact.createNewContact();
                    PhoneBookManager.addNewContact(phoneBook);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Please let's choose one!");
            }
        }
    }
}
