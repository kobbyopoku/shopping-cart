package shoppingcart;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartTest {
    public static void main(String[] args) throws FileNotFoundException {


//        UC1 - A test program that creates an instance of Cart, populates it with several orders (for both products and
//        discount products), and uses a for-each loop to produce a formatted listing of the orders with their price,
//        the number of items in the cart and the overall total price.
//        Note: You can either use a data file to dynamically read orders, or hardcode the order instances to add to the
//        cart.

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

        Order order1 = new Order(2, peach.getUnitPrice() * 2, peach);
        Order order2 = new Order(2, mango.getUnitPrice() * 2, mango);
        Order order3 = new Order(2, apple.getUnitPrice() * 2, apple);
        Order order4 = new Order(2, guava.getUnitPrice() * 2, guava);


        System.out.println("CREATING A NEW CUSTOMER");

        Name name = new Name();
        Customer customer = new Customer();
        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Enter the customer's first name: ");
        name.setFirstName("Kobby");

//        System.out.println("Enter the customer's family name: ");
        name.setFamilyName("Opoku");

        System.out.println(name.toString());

        System.out.println("Enter the customer's ID: ");
        customer.setCustomerId("P0123");
        customer.setName(name);

        System.out.println(customer.toString());

        Date date = new Date(1, 1, 20);
        System.out.println(date.toString());

        List<Order> orders = new ArrayList<Order>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);

        Cart cart = new Cart("C001", customer, date, orders);

        System.out.println(cart.toString());


//        UC2 - Test each of the sort methods work as expected, as evidenced by appropriate output.
//        • For the sortOrders(Comparator<Order>) method, you should pass in a custom comparator that sorts by cost
//        (asc) and if these are the same then by product (desc).



//        UC3 - Additionally, test the use of equality by using the contains and remove methods. Also, you should use a
//        PrintWriter to produce a receipt for all of the orders and associated details of the cart, and output these
//        into a text file Cart.txt.

        boolean isAvailable =  cart.containsOrder(order3); //Testing to see if cart contains order 3
        System.out.println("Card contains order 3: " + isAvailable );

        cart.removeOrder(order3); //Order 3 removed by removeOrder method
        boolean isOrderAvailable =  cart.containsOrder(order3); //Testing again to see if cart contains order 3
        System.out.println("Card contains order 3: " + isOrderAvailable );


        File file = new File("Cart.txt");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.write(cart.toString());
        printWriter.flush();
        printWriter.close();


//        UC4 - Add further code to show how each method of Cart can be used. In particular, increase and/or decrease
//        the quantity of one or more of the products in the cart, and then re-print the updated cart listing.

        cart.setOrders(orders); //Sorting the cart orders
        cart.getTotalCost(); // Getting the total cost of orders in the cart
        cart.addOrder(order3); // Adding order 3 back to the cart
        cart.getOrders().get(0).setQuantity(1); //Getting the first cart item and setting the quantity to 1
        cart.getNoOfItems(); // Get the total number of items in the cart

        orders.get(1).setCost(10);
        printWriter.write(cart.toString());
        printWriter.flush();
        printWriter.close();

//        UC5: Create an instance of RewardProcessor, add a selection of products to it (but not all the same as
//        those in your cart), and then test the rewardPoints method appropriately.

        Product p1 = new Product("P011", "HP", 90);
        Product p2 = new Product("P012", "DELL", 100);
        Product p3 = new Product("P013", "SURFACE PRO", 130);
        Product p4 = new Product("P014", "MACBOOK", 200);

        RewardProcessor rewardProcessor = new RewardProcessor();
        rewardProcessor.addProduct(guava);
        rewardProcessor.addProduct(apple);
        rewardProcessor.addProduct(p3);
        rewardProcessor.addProduct(peach);

        int rewardPoints = rewardProcessor.rewardPoint(cart);
        System.out.println("Reward points: "+rewardPoints);
        customer.addRewardPoints(rewardPoints);

        System.out.println(cart.toString());


//        UC6: Create four different Order object instances and ensure each has a different price policy –
//        default, buy 1 get 1 free, buy 2 get 1 free, and buy 5 get 1 free.
//        Calculate the cost of each to show the price policies are being applied correctly, and test each
//        policy with different quantities.

        Order o1 = new Order(3, p1.getUnitPrice() * 3, p1);
        Order o2 = new Order(5, p2.getUnitPrice() * 5, p2);
        Order o3 = new Order(4, p3.getUnitPrice() * 4, p3);
        Order o4 = new Order(7, p4.getUnitPrice() * 7, p4);


    }
}
