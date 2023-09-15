package JavaOOPHW5_2.Data;

/**
 * Буква S.
 * Класс WhatsUpPhoneBook не перегружен различным функционалом.
 * Отвечает только за создание экземпляра
 */

import Seminar6_SOLID.Task1.Book;

/**
 * Буква O
 * Класс WhatsUpPhoneBook не меняет функционал PhoneBook а только его дополняет
 * В этом классе мы можем добавить фото.
 *
 * Буква L
 * Класс WhatsUpPhoneBook наследуется от PhoneBook
 * Если мы заменим класс PhoneBook на класс WhatsUpPhoneBook - ничего не должно сломаться
 */


public class WhatsUpPhoneBook extends PhoneBook{
    Boolean foto;
    public WhatsUpPhoneBook(String name) {
        super(name);
    }

    public Boolean getFoto() {
        return foto;
    }

    public void setFoto(Boolean foto) {
        this.foto = foto;
    }
}
