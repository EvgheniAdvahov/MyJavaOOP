package JavaOOPHW7_v2.Controller;

import JavaOOPHW7_v2.Data.Number;
import JavaOOPHW7_v2.Data.NumberFactory;
import JavaOOPHW7_v2.Service.UserInput;
import JavaOOPHW7_v2.View.ViewResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyController implements IMyController{

    UserInput userInput = new UserInput();
    List<String> mylist = new ArrayList<>();
    ViewResult viewResult = new ViewResult();


    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Controller Started");
        mylist = userInput.userTypeInput();
        Number number = new NumberFactory().createNumber(mylist.get(0), mylist.get(1));
        System.out.println("Выберите одну из операций + * /");
        String userInput = scanner.nextLine();
        if (userInput.equals("+")) {
            viewResult.viewResult(number.sum(mylist));
        } else if (userInput.equals("*")) {
            viewResult.viewResult(number.multiply(mylist));
        } else if (userInput.equals("/")) {
            viewResult.viewResult(number.devide(mylist));
        } else {
            System.out.println("Неправильный ввод");
        }
    }
}
