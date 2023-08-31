package JavaOOPHW2;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Animals human = new Human("Ivan");
        Animals cat = new Cats("Kuzea");
        Entity robot = new Robot("Robocop");
        Wall wall = new Wall("Wall", 1);
        RunningTruck truck = new RunningTruck("Truck", 500);

        List<Entity> entityList = new ArrayList<>();
        entityList.add(human);
        entityList.add(cat);
        entityList.add(robot);

        List<Obstacles> obstacles = new ArrayList<>();
        obstacles.add(wall);
        obstacles.add(truck);

        for (Object obstacle : obstacles) {
            for (Entity entity : entityList) {
                if (obstacle instanceof Wall) {
                    if (!entity.jump(((Wall) obstacle).getHeight())) {
                        entityList.remove(entity);
                        break;
                    }
                } else {
                    if (!entity.run(((RunningTruck) obstacle).getLength())) {
                        entityList.remove(entity);
                        break;
                    }
                }
            }
        }
        for (Entity entity : entityList) {
            System.out.println("Came to finish " + entity.getName());
        }


    }
}
