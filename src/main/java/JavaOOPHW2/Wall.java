package JavaOOPHW2;

public class Wall extends Obstacles {
    private int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
//        Add.Add(this);
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "name='" + name + '\'' +
                '}';
    }
}
