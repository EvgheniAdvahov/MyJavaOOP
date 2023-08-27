package JavaOOPHW1;

import static JavaOOPHW1.ListTovar.getShop;
import static JavaOOPHW1.User.customerlist;


public class Main {
    public static void main(String[] args) {
        Category seafood = new Category("Seafood", new String[]{"shrimps", "crabs", "sharks", "octopus"});
        Category milkfood = new Category("Dairy products", new String[]{"milk", "cheese", "yogurt", "butter"});

        ListTovar item1 = new ListTovar("milk", 2.5, 5);
        ListTovar item2 = new ListTovar("cheese", 5, 3);
        ListTovar item3 = new ListTovar("yogurt", 2, 4);
        ListTovar item4 = new ListTovar("crabs", 10, 3);
        System.out.println("Store has= " + getShop());

        System.out.println(item2.getName() + "- product category " + item2.getProductcategory());


        User firstuser = new User("First");
        User secondtuser = new User("Second");

        firstuser.buy(item1);
        firstuser.cancelPurchase(item1);

        secondtuser.buy(item1);


        System.out.println(customerlist);
        System.out.println("Store has= " + getShop());


    }


}
