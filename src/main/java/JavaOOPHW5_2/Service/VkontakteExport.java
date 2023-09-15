package JavaOOPHW5_2.Service;

import JavaOOPHW5_2.Data.PhoneBook;

public class VkontakteExport implements ImportContacts {
    @Override
    public void importTo(PhoneBook book) {
        System.out.println("Контакты из vkontakte экспортированны в " + book.getName());
    }
}
