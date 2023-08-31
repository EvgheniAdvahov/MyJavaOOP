package JavaOOPHW2;


public class Robot extends Entity  {
    private final int jumpLenght = 0;
    private final int runLenght = 300;

    public Robot(String name) {
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
        return "Robot{" +
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
