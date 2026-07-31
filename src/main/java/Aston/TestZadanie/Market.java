package Aston.TestZadanie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Market {
    static void main() {
        Basket bs = new BasketImpl();
        bs.addProduct("Хлеб", 5);
        bs.updateProductQuantity("Хлеб", 3);
        System.out.println(bs.getProducts());
        System.out.println(bs.getProductQuantity("Хлеб"));
    }
}

class BasketImpl implements Basket {
    private final Map<String, Integer> basket;

    public BasketImpl() {
        basket = new HashMap<>();
    }

    @Override
    public void addProduct(String product, int quantity) {
        basket.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        basket.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        basket.put(product, quantity);
    }

    @Override
    public void clear() {
        basket.clear();
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<>(basket.keySet());
    }

    @Override
    public int getProductQuantity(String product) {
        return basket.get(product);
    }
}

interface Basket {
    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    List<String> getProducts();

    int getProductQuantity(String product);
}
