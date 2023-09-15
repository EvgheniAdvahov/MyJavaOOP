package JavaOOPHW5_2.Service;

import JavaOOPHW5_2.Data.PhoneBook;

public class FacebookExport implements ImportContacts {
    @Override
    public void importTo(PhoneBook book) {
        System.out.println("Контакты из facebook экспортированны в " + book.getName());
    }
}
