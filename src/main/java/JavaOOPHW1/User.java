package JavaOOPHW1;

import java.util.ArrayList;
import java.util.List;

import static JavaOOPHW1.ListTovar.shop;

public class User {
    private String  login;
    private String password;
    private Basket userbasket = new Basket();

    static List<User> customerlist = new ArrayList<>();

    public User(String login) {
        this.login = login;
        addCustomerToList(this);
    }

    public void buy(ListTovar item) {
        if (shop.contains(item)) {
            userbasket.addToBasket(item);
            System.out.println(login + "customer have in basket " + userbasket.getBasket());
        } else {
            System.out.println(item + " not in store");
        }
    }

    public void cancelPurchase(ListTovar item) {
        if (userbasket.getBasket().contains(item)) {
            userbasket.removeFromBasket(item);
        } else {
            System.out.println(item + " not in " + login + "basket");
        }
    }

    public void addCustomerToList(User customer){
        customerlist.add(customer);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name=" + login + "  " + userbasket + '}';
    }
}
