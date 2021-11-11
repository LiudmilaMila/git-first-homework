package task4;

import java.math.BigDecimal;

public class ShippingDetails {

    private String address;

    private BigDecimal price;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
