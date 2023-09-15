package JavaOOPHW5_2.Data;

/**
 * Буква S
 * Класс отвечает только за создание екземпляра. Функционал только getName и setName.
 */
public class PhoneBook {
    String name;

    public PhoneBook(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
