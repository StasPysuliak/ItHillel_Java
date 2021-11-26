package home.work17.task2;

import java.util.Objects;
import java.util.TreeMap;

public class Product {
    private String productName;
    private Integer count;
    private TreeMap<String, Integer> products = new TreeMap<>();

    public Product(String productName, Integer count) {
        this.productName = productName;
        this.count = count;
        products.put(productName,count);
    }
}
