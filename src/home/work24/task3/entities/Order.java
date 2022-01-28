package home.work24.task3.entities;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private final Long id;
    private final String status;
    private final LocalDate orderDate;
    private final LocalDate deliveryDate;
    private final List<Product> products;
    private final Customer customer;

    public Order(Long id, String status, LocalDate orderDate, LocalDate deliveryDate, List<Product> products, Customer customer) {
        this.id = id;
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.products = products;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return String.format(
                "id: %d\nstatus: %s\norder date: %s\ndelivery date: %s\nproducts:\n%s\ncustomer:\n%s\n",
                id,
                status,
                orderDate,
                deliveryDate,
                products,
                customer
        );
    }
}
