package JavaOOPHW2;

import java.lang.annotation.Annotation;

public class Human extends Animals {
    private final int jumpLenght = 1;
    private final int runLenght = 500;

    public Human(String name) {
        super(name);
    }

    public int getJumpLenght() {
        return jumpLenght;
    }

    public int getRunLenght() {
        return runLenght;
    }

    @Override
    public String toString() {
        return "Human{" +
                "jumpLenght=" + jumpLenght +
                ", runLenght=" + runLenght +
                '}';
    }

    @Override
    public boolean run(int lenght) {
        if (getRunLenght() >= lenght) {
            System.out.println(getName() + " Run " + runLenght);
            return true;
        } else {
            System.out.println(getName() + " Did not run");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (getJumpLenght() >= height) {
            System.out.println(getName() + " Jump " + jumpLenght);
            return true;
        } else {
            System.out.println(getName() + " Did not jump");
            return false;
        }
    }
}
