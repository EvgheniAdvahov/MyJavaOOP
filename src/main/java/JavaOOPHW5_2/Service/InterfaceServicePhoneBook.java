package JavaOOPHW5_2.Service;


/**
 * Буква О.
 * С помошью этого интерфейса мы расширяем 2 Класса. Не модифицируя их.
 * У каждого класса своя имплементация методов
 * Если у нас появится новый класс ServiceViberPhoneBook мы только в нём переопределим методы
 */


public interface InterfaceServicePhoneBook {
    String importPhoneBook(String name);

    String exportPhoneBook(String name);
}
