package home.work17.task2;

public class Customer {
    private String name;
    private String product;
    private int count;

    public Customer(String name, String product, int count) {
        this.name = name;
        this.product = product;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public String getProduct() {
        return product;
    }

    public int getCount() {
        return count;
    }
}
