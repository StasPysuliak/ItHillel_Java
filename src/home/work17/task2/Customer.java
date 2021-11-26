package home.work17.task2;

import java.util.Objects;
import java.util.TreeMap;

public class Customer {
    private String name;
    private Product product;

    public Customer(String name, Product product) {
        Objects.requireNonNull(name);
        Objects.requireNonNull(product);
        this.name = name;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public Product getProduct() {
        return product;
    }
}
