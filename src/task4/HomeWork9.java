package task4;

import java.math.BigDecimal;

public class HomeWork9 {
    public static void main(String[] args) {

        HomeWork9 homeWork91 = new HomeWork9();
        homeWork91.run();
    }

    private void run() {
        doTasks();

    }

    private void doTasks() {

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


        doTask1(products);
        doTask2(orders);
        doTask3(orders);
        doTask4(orders);
        doTask5(orders);
        doTask6(orders);
        doTask7(orders);
    }

    private void writeOrders(Order[] orders) {
        for (int i = 0; i < orders.length; i++) {

            writeOrder1(orders[i]);
        }
    }

    private void writeOrder1(Order order) {
        System.out.println("\nЗаказ №" + order.getId());
        System.out.println("Заказчик: " + order.getCustomer().getId() + " " + order.getCustomer().getName());
        printProducts(order.getProducts());
        System.out.println("День заказа: " + order.getDayOfCrteation());
        System.out.println("Статус заказа: " + order.getStatus());
        System.out.println("Адрес доставки " + order.getShippingDetails().getAddress());
        System.out.println("Цена доставки " + order.getShippingDetails().getPrice() + " грн.");
    }

    private void printProducts(Product[] products) {

        for (int i = 0; i < products.length; i++) {
            printProduct(products[i]);
        }
    }

    private void printProduct(Product product) {
        System.out.println("Заказанный продукт: " + product.getId() + " " +
                product.getName() + " цена: " + product.getPrice() + " грн.");
    }

    private void doTask5(Order[] orders) {
        Customer[] customers = findUniqueCustomers_Task5(orders);
        printCustomers(customers);
    }

    private void printCustomers(Customer[] customers) {

        System.out.println("Заказчики : ");
        for (int i = 0; i < customers.length; i++) {

            System.out.println((i + 1) + customers[i].getId() +
                    " " + customers[i].getName());
        }
    }

    private Customer[] findUniqueCustomers_Task5(Order[] orders) {
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

    private void doTask1(Product[] products) {
        sortTask1(products);
        printProducts(products);

    }

    private void sortTask1(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products.length; j++) {
                if (compareProductsByPriceAndName_Task1(
                        products[i], products[j]) < 0) {
                    swapProducts(products, i, j);

                }
            }
        }
    }

    private int compareProductsByPriceAndName_Task1(Product product1, Product product2) {
        int result;

        // проверяем стоимость по возрастанию
        result = product1.getPrice().compareTo(product2.getPrice());
        if (result != 0) {
            return result;
        }

        // проверяем название по возрастанию
        result = product1.getName().compareTo(product2.getName());
        if (result != 0) {
            return -result; // negate to reverse order
        }

        return 0; // equal products
    }

    private void swapProducts(Product[] products, int i, int j) {
        Product product = products[i];
        products[i] = products[j];
        products[j] = product;
    }

    private void doTask2(Order[] orders) {
        sortOrdersByDayAndPriceAndQuantityProducts_Task2(orders);
        writeOrders(orders);
    }

    private void sortOrdersByDayAndPriceAndQuantityProducts_Task2(Order[] orders) {
        for (int i = 0; i < orders.length; i++) {
            for (int j = 0; j < orders.length; j++) {
                if (compareOrdersByDayPriceAndQuantityProducts_Task2(orders[i], orders[j]) < 0) {
                    Order order = orders[i];
                    orders[i] = orders[j];
                    orders[j] = order;
                }
            }
        }

    }

    private int compareOrdersByDayPriceAndQuantityProducts_Task2(
            Order order1, Order order2) {
        int result;
        // проверяем день создания по убыванию

        result = Integer.compare(order1.getDayOfCrteation(), order2.getDayOfCrteation());
        if (result != 0) {
            return -result;
        }

        //проверяем стоимость по убыванию
        result = order1.getSumOfOrder().compareTo(order2.getSumOfOrder());
        if (result != 0) {
            return -result;
        }
        //проверяем количество продуктов по возрастанию
        result = Integer.compare(order1.getProducts().length, order2.getProducts().length);
        if (result != 0) {
            return result;
        }
        return result;


    }

    private void doTask3(Order[] orders) {
//        Вывести заказы с характеристиками:
//        идентификатор заказа, статус, количество продуктов в заказе,
//        имя заказчика, общая стоимость заказа.
//        Таблица отсортирована по полям в таком порядке:
//        день создания (desc), статус (asc), имя заказчика (asc), общая стоимость (desc).
        sortTask3(orders);
        printTask3(orders);

    }

    private void printTask3(Order[] orders) {
        final String titlePattern = "|%12s|%19s|%15s|%20s|%15s|%18s|%n";
        final String linePattern = "|%12d|%19s|%15d|%20d|%15s|%18s|%n";

        System.out.printf(titlePattern,
                "ID заказа",
                "Статус",
                "День создания",
                "Кол-во продуктов",
                "Имя заказчика",
                "Общая стоимость");
        for (Order order : orders) {
            System.out.printf(linePattern,
                    order.getId(),
                    order.getStatus(),
                    order.getDayOfCrteation(),
                    order.getProducts().length,
                    order.getCustomer().getName(),
                    order.getSumOfOrder());
        }
    }

    private int compareTask3(Order order1, Order order2) {
        int result;

//        проверяем день создания по убыванию
        result = Integer.compare(order1.getDayOfCrteation(), order2.getDayOfCrteation());
        if (result != 0) {
            return -result;
        }

//        проверяем статус по возрастанию
        result = order1.getStatus().compareTo(order2.getStatus());
        if (result != 0) {
            return result;
        }

//        проверяем имя заказчика по возрастанию
        result = order1.getCustomer().getName().compareTo(order2.getCustomer().getName());
        if (result != 0) {
            return result;
        }

//        проверяем общую стоимость по убыванию
        result = order1.getSumOfOrder().compareTo(order2.getSumOfOrder());
        if (result != 0) {
            return -result;
        }
        return result;
    }

    private void sortTask3(Order[] orders) {
        for (int i = 0; i < orders.length; i++) {
            for (int j = 0; j < orders.length; j++) {
                if (compareTask3(orders[i], orders[j]) < 0) {
                    Order order = orders[i];
                    orders[i] = orders[j];
                    orders[j] = order;

                }

            }
        }
    }

    private void doTask4(Order[] orders) {
        Order[] foundOrders = findOrdersByCustomer_Task4(orders, 65);
        if (foundOrders.length > 0) {
            writeOrders(foundOrders);
        } else {
            System.out.println("Совпадения не найдены");
        }
    }

    private Order[] findOrdersByCustomer_Task4(Order[] orders, int customerId) {
        Order[] foundOrders = new Order[orders.length];
        int j = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i].getCustomer().getId() == customerId) {
                foundOrders[j] = orders[i];
                j++;
            }
        }

        Order[] result = new Order[j];
        System.arraycopy(foundOrders, 0, result, 0, j);
        return result;

    }

    private void doTask6(Order[] orders) {
        Order[] foundOrders = findOrdersByProduct_Task6(orders, 4458);
        if (foundOrders.length > 0) {
            writeOrders(foundOrders);
        } else {
            System.out.println("Совпадения не найдены");
        }
    }

    private Order[] findOrdersByProduct_Task6(Order[] orders, int productId) {
        Order[] foundOrders = new Order[orders.length];
        int k = 0;
        for (int i = 0; i < orders.length; i++) {
            Order order = orders[i];
            Product[] products = order.getProducts();
            for (int j = 0; j < products.length; j++) {
                Product product = products[j];
                if (product.getId() == productId) {
                    foundOrders[k] = order;
                    k++;
                    break;
                }
            }
        }
        Order[] result = new Order[k];
        System.arraycopy(foundOrders, 0, result, 0, k);
        return result;
    }

    private void doTask7(Order[] orders) {
        Product[] products = findUniqueProducts_Task7(orders);
        printProducts(products);

    }

    private Product[] findUniqueProducts_Task7(Order[] orders) {
        Product[] foundProducts = new Product[0];
        int p = 0;
        for (int i = 0; i < orders.length; i++) {
            Order order = orders[i];
            Product[] products = order.getProducts();
            for (int j = 0; j < products.length; j++) {
                Product product = products[j];
                if (!hasProduct(foundProducts, product.getId())) {
                    if (foundProducts.length <= p) {
                        Product[] newArray = new Product[foundProducts.length + 1];
                        System.arraycopy(foundProducts, 0,
                                newArray, 0,
                                foundProducts.length);
                        foundProducts = newArray;

                    }
                    foundProducts[p] = product;
                    p++;

                }
            }
        }

        return foundProducts;
    }

    private boolean hasProduct(Product[] products, int productId) {
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];

            if (product != null && product.getId() == productId) {
                return true;
            }
        }
        return false;
    }

}



