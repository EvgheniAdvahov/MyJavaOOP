package JavaOOPHW5_2.App;

import JavaOOPHW5_2.Data.PhoneBook;
import JavaOOPHW5_2.Data.WhatsUpPhoneBook;
import JavaOOPHW5_2.Service.*;

public class Main {
    public static void main(String[] args) {
//        MyController controller = new MyController();
//        controller.startController();
        /**
         * Буква D
         * Общий интерфейс ExportContacts(набор общих методов для PhoneBook)
         */
        PhoneBook phoneBook = new PhoneBook("Phone Book");
        PhoneBook phoneBook1 = new WhatsUpPhoneBook("WhatsUP Phone Book");
        ImportContacts exportContacts = new FacebookExport();
        ImportContacts exportContacts1 = new VkontakteExport();
        exportContacts.importTo(phoneBook);
        exportContacts1.importTo(phoneBook1);


    }
}
