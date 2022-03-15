package storage;

import model.PhoneBook;

import java.io.*;
import java.util.ArrayList;

public class PhoneFromFileBinary implements IPhoneData{
    @Override
    public ArrayList<PhoneBook> readFile(ArrayList<PhoneBook> phoneBookList) throws IOException {
        File file = new File("phone.txt");
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            Object result = ois.readObject();
            phoneBookList = (ArrayList<PhoneBook>) result;
            return phoneBookList;
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            ois.close();
            fis.close();
        }
        return new ArrayList<>();
    }

    @Override
    public void writeFile(ArrayList<PhoneBook> phoneBookList) throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream("phone.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(phoneBookList);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            oos.close();
            fos.close();
        }
    }
}
