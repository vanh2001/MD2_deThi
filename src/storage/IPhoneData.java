package storage;

import model.PhoneBook;

import java.io.IOException;
import java.util.ArrayList;

public interface IPhoneData {
    ArrayList<PhoneBook> readFile(ArrayList<PhoneBook> phoneBookList) throws IOException;

    void writeFile(ArrayList<PhoneBook> phoneBookList) throws IOException;
}
