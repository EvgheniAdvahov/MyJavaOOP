package JavaOOPHW7_v2.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UserInput {
    Scanner scanner = new Scanner(System.in);
    String input;
    List<String> myList = new ArrayList<>();

    /**
     * Буква S
     * Класс отвечает только за ввод данных от пользователя
     */
    public List<String> userTypeInput() {
        System.out.println("Возможен ввод комплексного числа в формате a+bi или a-bi, где a и b числа");
        System.out.println("Пожалуйста введите первое число: ");
        input = scanner.nextLine();
        myList.add(input);
        System.out.println("Пожалуйста введите второе число:");
        input = scanner.nextLine();
        myList.add(input);
        return myList;
    }
}
