package controller;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static final String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    private static final String PHONE_REGEX = "(84|0[3|5|7|8|9])+([0-9]{8})\\b";

    //Validate số điện thoại:
    public boolean checkRegexPhoneNumber(String input){
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
    public String checkPhoneNumber(){
        Scanner inputPhoneNumber = new Scanner(System.in);
        String phoneNumber = "";
        while (!checkRegexPhoneNumber(phoneNumber)) {
            try {
                phoneNumber = inputPhoneNumber.nextLine();
            }catch (Exception e){
                System.err.println("Input phone number again!!!");
            }
        }
        return phoneNumber;
    }

    //Validate Email:
    public boolean checkRegexEmail(String input){
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
    public String checkEmail(){
        Scanner inputEmail = new Scanner(System.in);
        String email = "";
        while (!checkRegexEmail(email)){
            try {
                email = inputEmail.nextLine();
            }catch (Exception e){
                System.err.println("Input email again");
            }
        }
        return email;
    }

    //Validate String:
    public String checkNullString(){
        Scanner scanner = new Scanner(System.in);
        String str;
        while (true){
            str = scanner.nextLine();
            if (str.trim().equals("")){
                break;
            }else {
                System.err.println("Input again!");
            }
        }
        return str;
    }

    //Validate Boolean;
    public boolean checkGender(){
        Scanner scanner = new Scanner(System.in);
        boolean gender = false;
        while (true){
            gender = scanner.nextBoolean();
            if(gender){
                System.out.println("Gender: Male");
                break;
            }else {
                System.out.println("Gender: Female");
                break;
            }
        }
        return gender;
    }
}
