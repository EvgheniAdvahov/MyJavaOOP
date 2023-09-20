package JavaOOPHW7_v2.Controller;


/**
 * Буква L
 * Это дочерний класс MyController
 * Этот класс расширяет функционал МуСontroller
 * Вместо родителя MyController мы можем подставить MyControllerForPhone
 * */
public class MyControllerForPhone extends MyController implements IMyControllerForPhone{
    @Override
    public void start() {
        System.out.println("Controller started from Phone");
        super.start();
    }

    public void stop(){
        System.out.println("Phone Controller Stopped");
    }

    @Override
    public void StartByFaceId() {
        System.out.println("Start controller by recognizing face id");
    }
}
