package JavaOOPHW7_v2.View;

/**
 * Буква S
 * Класс отвечает только за вывод ответа в консоль
 */
public class ViewResult implements IViewResult {
    @Override
    public void viewResult(String result) {
        System.out.println("Ответ= " + result);
    }
}
