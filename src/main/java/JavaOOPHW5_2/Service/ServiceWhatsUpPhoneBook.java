package JavaOOPHW5_2.Service;

/**
 * Буква I
 * InterfaceServicePhoneBook не имеет функцию проверка на безопасность
 * InterfaceWhatsUpSecurity есть функция проверки на безопасность
 * Таким образом мы разделили функционал между двумя интерфейсами
 */
public class ServiceWhatsUpPhoneBook implements InterfaceServicePhoneBook,InterfaceWhatsUpSecurity{
    @Override
    public String importPhoneBook(String name) {
        System.out.println("WhatsUpPhoneBook imported");
        return null;
    }

    @Override
    public String exportPhoneBook(String name) {
        System.out.println("WhatsUpPhoneBook exported");
        return null;
    }

    @Override
    public void checkSecurity() {
        System.out.println("Checking security");
    }
}
