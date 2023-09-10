package JavaOOPHW5_2.Controller;

import JavaOOPHW5_2.Data.Format;
import JavaOOPHW5_2.Data.PhoneBook;

import JavaOOPHW5_2.Data.WhatsUpPhoneBook;
import JavaOOPHW5_2.Service.ServicePhoneBook;
import JavaOOPHW5_2.View.ViewPhoneBook;


import java.util.Scanner;

public class MyController {
    PhoneBook phoneBook = new WhatsUpPhoneBook("My WhatsUP Phone Book");
    ServicePhoneBook servicePhoneBook = new ServicePhoneBook();
    ViewPhoneBook viewPhoneBook = new ViewPhoneBook();



    public void startController() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type \"1\" to import PhoneBook \n" +
                "Type \"2\" to export PhoneBook");
        String userInput = scanner.nextLine();
        if(userInput.equals("1")){
            String name = servicePhoneBook.importBook(phoneBook.getName());
            viewPhoneBook.viewPhoneBook(name);
        } else if (userInput.equals("2")) {
            String name = servicePhoneBook.exportBook(phoneBook.getName());
            viewPhoneBook.viewPhoneBook(name);
        }else {
            System.out.println("Incorrect Input");
        }
    }
}
