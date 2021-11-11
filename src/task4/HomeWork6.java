package task4;

import java.math.BigDecimal;

public class HomeWork6 {
    public static void main(String[] args) {
        HomeWork6 homeWork6 = new HomeWork6();
        homeWork6.run();
    }

    private void run() {
        Customer customer1 = new Customer();
        customer1.setId(6976465);
        customer1.setName("Данилов");

        Customer customer2 = new Customer();
        customer2.setId(88652);
        customer2.setName("Дорохова");

        Customer customer3 = new Customer();
        customer3.setId(6544156);
        customer3.setName("Яковенко");


        ShippingDetails shippingDetails = new ShippingDetails();
        shippingDetails.setAddress("ул. Ковтуна 24");
        shippingDetails.setPrice(new BigDecimal("25.00"));

        Product product = new Product();
        product.setPrice(new BigDecimal("563.12"));
        product.setName("Стол");
        product.setId(4458);

        Product product1 = new Product();
        product1.setId(5568);
        product1.setName("Диван");
        product1.setPrice(new BigDecimal("11654.98"));

        Product product2 = new Product();
        product2.setId(465486);
        product2.setName("Торшер");
        product2.setPrice(new BigDecimal("596.47"));

        Product product3 = new Product();
        product3.setId(9733);
        product3.setName("Стул");
        product3.setPrice(new BigDecimal("1003.50"));

        Product product4 = new Product();
        product4.setId(8953);
        product4.setName("Зеркало");
        product4.setPrice(new BigDecimal("497.35"));


        Product[] products = new Product[5];
        products[0] = product;
        products[1] = product1;
        products[2] = product2;
        products[3] = product3;
        products[4] = product4;


        Order order1 = new Order();
        order1.setCustomer(customer1);
        order1.setId(76699);
        order1.setProducts(new Product[]{product1, product4});
        order1.setStatus(OrderStatus.ACCEPTED);
        order1.setDayOfCrteation(27);
        order1.setShippingDetails(shippingDetails);

        Order order2 = new Order();
        order2.setCustomer(customer2);
        order2.setId(564651);
        order2.setProducts(new Product[]{products[2], products[3]});
        order2.setStatus(OrderStatus.DELIVERY_EXPEСTED);
        order2.setDayOfCrteation(7);
        order2.setShippingDetails(shippingDetails);


        Order order3 = new Order();
        order3.setCustomer(customer3);
        order3.setId(635102);
        order3.setProducts(new Product[]{products[0], products[1]});
        order3.setStatus(OrderStatus.PAID);
        order3.setDayOfCrteation(13);
        order3.setShippingDetails(shippingDetails);

        Order order4 = new Order();
        order4.setCustomer(customer2);
        order4.setId(5741);
        order4.setProducts(new Product[]{products[0], products[2]});
        order4.setStatus(OrderStatus.DELIVERY_EXPEСTED);
        order4.setDayOfCrteation(7);
        order4.setShippingDetails(shippingDetails);


        Order[] orders = new Order[4];
        orders[0] = order1;
        orders[1] = order2;
        orders[2] = order3;
        orders[3] = order4;

        doTask1(orders);
        doTask2(orders);
        doTask3(orders);


    }

    private void doTask2(Order[] orders) {

        System.out.println("\nВывести заказы со статусом “ожидается доставка” и их адрес для доставки.");

        for (int i = 0; i < orders.length; i++) {

            if (orders[i].getStatus() == OrderStatus.DELIVERY_EXPEСTED) {
                System.out.println("Заказ № " + orders[i].getId()
                        + "\nСтатус заказа " + orders[i].getStatus()
                        + "\nАдрес доставки : " + orders[i].getShippingDetails().getAddress());
            }

        }
    }

    private void doTask1(Order[] orders) {
        for (int i = 0; i < orders.length; i++) {
            System.out.println("\nСумма заказа № " + orders[i].getId() + " - "
                    + orders[i].getSumOfOrder() + " грн.");
        }
    }

    private void doTask3(Order[] orders) {
        Customer[] customers = findUniqueCustomers(orders);
        CustomerWithQuantityAndTotalCost[] results
                = new CustomerWithQuantityAndTotalCost[customers.length];

        for (int i = 0; i < customers.length; i++) {
            CustomerWithQuantityAndTotalCost temp
                    = new CustomerWithQuantityAndTotalCost();
            Customer customer = customers[i];
            temp.customer = customer;
            temp.quantity = getQuantityOrdersByCustomer(orders, customer);
            temp.totalCost = sumOfOrdersByCustomer(orders, customer);
            results[i] = temp;
        }
        sortOrdersByQuantityAndSumTaskBig3(results);
        printTask3(results);

    }

    private void printTask3(CustomerWithQuantityAndTotalCost[] results) {
        for (CustomerWithQuantityAndTotalCost result : results) {
            System.out.println("Заказчик " + result.customer.getId() +
                    " " + result.customer.getName() +
                    " сделал заказов: " + result.quantity +
                    " на сумму " + result.totalCost + " грн. ");

        }
    }

    private void sortOrdersByQuantityAndSumTaskBig3(CustomerWithQuantityAndTotalCost[] results) {
        for (int i = 0; i < results.length; i++) {
            for (int j = 0; j < results.length; j++) {
                if (compareQuantityOrdersAndSumTask3(results[i], results[j]) < 0) {
                    CustomerWithQuantityAndTotalCost temp = results[i];
                    results[i] = results[j];
                    results[j] = temp;
                }
            }
        }

    }

    private int compareQuantityOrdersAndSumTask3(CustomerWithQuantityAndTotalCost customer1,
                                                 CustomerWithQuantityAndTotalCost customer2) {
        int result;
        // проверяем количество по убыванию
        result = Integer.compare(customer1.quantity, customer2.quantity);
        if (result != 0) {
            return -result; // negate to reverse order
        }

        // проверяем стоимость по убыванию
        result = customer1.totalCost.compareTo(customer2.totalCost);
        if (result != 0) {
            return -result;
        }

        return 0;
    }

    private int getQuantityOrdersByCustomer(Order[] orders, Customer customer) {
        int guantity = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i].getCustomer().getId() == customer.getId()) {
                guantity += 1;
            }

        }
        return guantity;
    }


    private BigDecimal sumOfOrdersByCustomer(Order[] orders, Customer customer) {
        BigDecimal sum = new BigDecimal("0.00");
        for (int i = 0; i < orders.length; i++) {
            if (orders[i].getCustomer().getId() == customer.getId()) {
                sum = sum.add(orders[i].getSumOfOrder());
            }

        }
        return sum;
    }

    private Customer[] findUniqueCustomers(Order[] orders) {
        Customer[] foundCustomers = new Customer[orders.length];
        int customerIndex = 0;
        for (Order order : orders) {
            Customer customer = order.getCustomer();
            if (!hasCustomer(foundCustomers, customer.getId())) {
                foundCustomers[customerIndex] = customer;
                customerIndex++;
            }
        }

        Customer[] result = new Customer[customerIndex];
        System.arraycopy(foundCustomers, 0, result, 0, result.length);
        return result;

    }

    private boolean hasCustomer(Customer[] customers, int customerId) {
        for (int i = 0; i < customers.length; i++) {
            Customer customer = customers[i];
            if (customer != null && customer.getId() == customerId) {
                return true;
            }
        }
        return false;
    }
}
