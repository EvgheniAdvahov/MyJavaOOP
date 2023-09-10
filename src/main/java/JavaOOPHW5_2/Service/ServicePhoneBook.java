package JavaOOPHW5_2.Service;

import JavaOOPHW5_2.Data.Format;

import java.util.Scanner;

public class ServicePhoneBook implements InterfaceServicePhoneBook {
    public String exportBook(String name){
        Format format;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type \"1\" for PDF format\nType \"2\" for CSV format \nType \"3\" for JSON format");
        String userInput = scanner.nextLine();
        if(userInput.equals("1")){
            format = Format.PDF;
            System.out.println(name + " exported in " + format);
        }
        else if (userInput.equals("2")) {
            format = Format.CSV;
            System.out.println(name + " exported in " + format);
        } else if (userInput.equals("3")) {
            format = Format.JSON;
            System.out.println(name + " exported in " + format);
        }else {
            System.out.println("Incorrect Input");
        }
        return name;
    }
    public String importBook(String name){
        System.out.println(name + " imported");
        return name;
    }
}
