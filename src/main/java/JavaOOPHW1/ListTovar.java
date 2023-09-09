package JavaOOPHW1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static JavaOOPHW1.Category.category;


public class ListTovar {
    private String name;
    private double price;
    private int rating;

    private String productcategory;

    public static List<ListTovar> shop = new ArrayList<>();

    public ListTovar(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.productcategory = defineCategory(this);
        add(this);

    }

    public String getProductcategory() {
        return productcategory;
    }

    public String getName() {
        return name;
    }

    public void add(ListTovar item) {
        shop.add(item);
    }

    public void remove(ListTovar item) {
        shop.remove(item);
    }

    static List<ListTovar> getShop() {
        return shop;
    }

    public String defineCategory(ListTovar item) {
        for (int i = 0; i < category.size(); i++) {
            if (Arrays.toString(category.get(i).goods).contains(item.getName())) {
                return category.get(i).name;
            }
        }
        return "We dont have category for this product";
    }

    @Override
    public String toString() {
        return "{" + name + "- price=" + price + "}";
    }
}