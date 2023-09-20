package JavaOOPHW7_v2.App;

import JavaOOPHW7_v2.Controller.MyController;
import JavaOOPHW7_v2.Controller.MyControllerForPhone;

public class MainApp {
    public static void main(String[] args) {
//        MyController controller = new MyController();
//        controller.start();
        MyController controller = new MyControllerForPhone();
        controller.start();

    }
}
