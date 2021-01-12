package shoppingcart;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartTest {
    public static void main(String[] args) throws IOException {


//        UC1 - A test program that creates an instance of Cart, populates it with several orders (for both products and
//        discount products), and uses a for-each loop to produce a formatted listing of the orders with their price,
//        the number of items in the cart and the overall total price.
//        Note: You can either use a data file to dynamically read orders, or hardcode the order instances to add to the
//        cart.
//
//        Product product = new Product();
//        System.out.println("ADDING A NEW PRODUCT");
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the product code: ");
//        product.setProductCode(scanner.nextLine());
//
//        System.out.println("Enter the product description: ");
//        product.setDescription(scanner.nextLine());
//
//        System.out.println("Enter the product price: ");
//        product.setUnitPrice(scanner.nextInt());
//
//        System.out.println(product.toString());
//
//        Order order = new Order(2, product.getUnitPrice() * 2, product); //Creating a test order
//        System.out.println(order.toString());

        Product guava = new Product("P002", "guava", 90);
        Product peach = new Product("P002", "Peach", 100);
        Product mango = new Product("P003", "Mango", 130);
        Product apple = new Product("P004", "Apple", 200);

        Order order1 = new Order();
        order1.setQuantity(2);
        order1.setProduct(guava);
        order1.setCost(order1.getProduct().getUnitPrice() * order1.getQuantity());

        Order order2 = new Order();
        order2.setQuantity(3);
        order2.setProduct(mango);
        order2.setCost(order2.getProduct().getUnitPrice() * order2.getQuantity());

        Order order3 = new Order();
        order3.setQuantity(1);
        order3.setProduct(peach);
        order3.setCost(order3.getProduct().getUnitPrice() * order3.getQuantity());

        Order order4 = new Order();
        order4.setProduct(apple);
        order4.setQuantity(5);
        order4.setCost(order4.getProduct().getUnitPrice() * order4.getQuantity());


        System.out.println("CREATING A NEW CUSTOMER");

        Name name = new Name();
        Customer customer = new Customer();
        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Enter the customer's first name: ");
        name.setFirstName("Setriakor");

//        System.out.println("Enter the customer's family name: ");
        name.setFamilyName("Agboado");

        System.out.println(name.toString());

//        System.out.println("Enter the customer's ID: ");
        customer.setCustomerId("CU0123");
        customer.setName(name);

        System.out.println(customer.toString());

        Date date = new Date(14, 01, 20);
        System.out.println(date.toString());

        List<Order> orders = new ArrayList<Order>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);

        Cart cart = new Cart();
        cart.setCartId("CID002");
        cart.setCustomer(customer);
        cart.setDate(date);
        cart.setOrders(orders);

        System.out.println(cart.toString());


//        UC2 - Test each of the sort methods work as expected, as evidenced by appropriate output.
//        • For the sortOrders(Comparator<Order>) method, you should pass in a custom comparator that sorts by cost
//        (asc) and if these are the same then by product (desc).


        cart.sortOrders();
        cart.sortOrders((orderTest, t1) -> {
            if (orderTest.getCost() > t1.getCost()) {
                return -1;
            } else if (orderTest.getCost() < t1.getCost()) {
                return 1;
            } else {
                return 0;
            }
        });


//        UC3 - Additionally, test the use of equality by using the contains and remove methods. Also, you should use a
//        PrintWriter to produce a receipt for all of the orders and associated details of the cart, and output these
//        into a text file Cart.txt.

        boolean isAvailable = cart.containsOrder(order3); //Testing to see if cart contains order 3
        System.out.println("Card contains order 3: " + isAvailable);

        cart.removeOrder(order3); //Order 3 removed by removeOrder method
        boolean isOrderAvailable = cart.containsOrder(order3); //Testing again to see if cart contains order 3
        System.out.println("Card contains order 3: " + isOrderAvailable);


        File file = new File("Cart.txt");
        if(!file.exists())
            file.createNewFile();

        PrintWriter printWriter = new PrintWriter(file);

        printWriter.write("UC3 Solution.\n");
        printWriter.write("==========================================================================================\n");
        printWriter.write(cart.toString() + "\n\n\n");


//        UC4 - Add further code to show how each method of Cart can be used. In particular, increase and/or decrease
//        the quantity of one or more of the products in the cart, and then re-print the updated cart listing.

        cart.setOrders(orders); //Sorting the cart orders
        cart.getTotalCost(); // Getting the total cost of orders in the cart
        cart.addOrder(order3); // Adding order 3 back to the cart
        cart.getOrders().get(0).setQuantity(10); //Getting the first cart item and setting the quantity to 1
        cart.getNoOfItems(); // Get the total number of items in the cart
        orders.get(1).setCost(100); //Get the ssecond order in the list and change the cost to 100

        printWriter.write("UC4 Solution.\n");
        printWriter.write("==========================================================================================\n");
        printWriter.write(cart.toString() + "\n\n\n");

//        UC5: Create an instance of RewardProcessor, add a selection of products to it (but not all the same as
//        those in your cart), and then test the rewardPoints method appropriately.

        Product hp = new Product("P011", "HP", 90);
        Product dell = new Product("P012", "DELL", 100);
        Product surface = new Product("P013", "SURFACE PRO", 130);
        Product macbook = new Product("P014", "MACBOOK", 200);

        RewardProcessor rewardProcessor = new RewardProcessor();
        rewardProcessor.addProduct(macbook);
        rewardProcessor.addProduct(apple);
        rewardProcessor.addProduct(surface);
        rewardProcessor.addProduct(peach);

        int rewardPoints = rewardProcessor.rewardPoint(cart);
        System.out.println("Reward points: " + rewardPoints);
        customer.addRewardPoints(rewardPoints);

        System.out.println(cart.toString());
        printWriter.write("UC5 Solution.\n");
        printWriter.write("==========================================================================================\n");
        printWriter.write(cart.toString() + "\n\n\n");
        printWriter.flush();
        printWriter.close();


//        UC6: Create four different Order object instances and ensure each has a different price policy –
//        default, buy 1 get 1 free, buy 2 get 1 free, and buy 5 get 1 free.
//        Calculate the cost of each to show the price policies are being applied correctly, and test each
//        policy with different quantities.

        Order o1 = new Order(3, hp.getUnitPrice() * 3, hp);
        Order o2 = new Order(5, dell.getUnitPrice() * 5, dell);
        Order o3 = new Order(4, surface.getUnitPrice() * 4, surface);
        Order o4 = new Order(7, macbook.getUnitPrice() * 7, macbook);


    }
}
