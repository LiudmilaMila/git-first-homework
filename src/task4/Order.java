package task4;

import java.math.BigDecimal;

public class Order {
    private Product[] products;
    private Customer customer;
    private ShippingDetails shippingDetails;
    private int id;
    private OrderStatus status;
    private int dayOfCrteation;


    public int getDayOfCrteation() {
        return dayOfCrteation;
    }

    public void setDayOfCrteation(int dayOfCrteation) {
        this.dayOfCrteation = dayOfCrteation;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ShippingDetails getShippingDetails() {
        return shippingDetails;
    }

    public void setShippingDetails(ShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public BigDecimal getSumOfOrder() {
        BigDecimal sumOfProducts = new BigDecimal("0.00");
        BigDecimal sumOfOrders;
        for (int i = 0; i < products.length; i++) {
            sumOfProducts = products[i].getPrice().add(sumOfProducts);
        }
        if (shippingDetails != null) {
            sumOfOrders = sumOfProducts.add(shippingDetails.getPrice());
        } else {
            sumOfOrders = sumOfProducts;
        }
        return sumOfOrders;
    }
}
