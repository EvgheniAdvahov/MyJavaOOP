package JavaOOPHW2;

public class RunningTruck extends Obstacles {
    private int length;

    public RunningTruck(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "RunningTruck{" +
                "name='" + name + '\'' +
                '}';
    }
}
