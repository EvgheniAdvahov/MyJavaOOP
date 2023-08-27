package JavaOOPHW1;


import java.util.ArrayList;
import java.util.List;

public class Category {
    public String name;
    public String[] goods;

    static List<Category> category = new ArrayList<>();

    public Category(String name, String[] goods) {
        this.name = name;
        this.goods = goods;
        addCategory(this);
    }



    public void addCategory(Category item) {
        category.add(item);
    }

    public static void printCategories() {
        System.out.println(category);
    }

    @Override
    public String toString() {
        return name;
    }

}
