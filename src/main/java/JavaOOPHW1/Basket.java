package JavaOOPHW1;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import static JavaOOPHW1.ListTovar.shop;

@Data
public class Basket {
    private List<ListTovar> basket = new ArrayList<>();

    public void addToBasket(ListTovar item) {
        basket.add(item);
        shop.remove(item);
    }

    public void removeFromBasket(ListTovar item) {
        basket.remove(item);
        shop.add(item);
    }

    public List<ListTovar> getBasket() {
        return basket;
    }

    @Override
    public String toString() {
        return "In basket=" + basket;
    }
}
