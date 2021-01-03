package shoppingcart;

import java.util.Collections;
import java.util.Scanner;

public class CartTest {
    public static void main(String[] args) {


//        UC1 - A test program that creates an instance of Cart, populates it with several orders (for both products and
//        discount products), and uses a for-each loop to produce a formatted listing of the orders with their price,
//        the number of items in the cart and the overall total price.
//        Note: You can either use a data file to dynamically read orders, or hardcode the order instances to add to the
//        cart.

        Product product = new Product();
        System.out.println("ADDING A NEW PRODUCT");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the product code: ");
        product.setProductCode(scanner.nextLine());

        System.out.println("Enter the product description: ");
        product.setDescription(scanner.nextLine());

        System.out.println("Enter the product price: ");
        product.setUnitPrice(scanner.nextInt());

        System.out.println(product.toString());

        Order order = new Order(2, product.getUnitPrice() * 2, product); //Creating a test order
        System.out.println(order.toString());


        System.out.println("CREATING A NEW CUSTOMER");

        Name name = new Name();
        Customer customer = new Customer();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the customer's first name: ");
        name.setFirstName(scanner1.nextLine());

        System.out.println("Enter the customer's family name: ");
        name.setFamilyName(scanner1.nextLine());

        System.out.println(name.toString());

        System.out.println("Enter the customer's ID: ");
        customer.setCustomerId(scanner1.nextLine());
        customer.setName(name);

        System.out.println(customer.toString());

        Date date = new Date(1, 1, 20);
        System.out.println(date.toString());

        Cart cart = new Cart("C001", customer, date, Collections.singletonList(order));

        System.out.println(cart.toString());


//        UC2 - Test each of the sort methods work as expected, as evidenced by appropriate output.
//        • For the sortOrders(Comparator<Order>) method, you should pass in a custom comparator that sorts by cost
//        (asc) and if these are the same then by product (desc).


//        UC3 - Additionally, test the use of equality by using the contains and remove methods. Also, you should use a
//        PrintWriter to produce a receipt for all of the orders and associated details of the cart, and output these
//        into a text file Cart.txt.


//        UC4 - Add further code to show how each method of Cart can be used. In particular, increase and/or decrease
//        the quantity of one or more of the products in the cart, and then re-print the updated cart listing.

        cart.setOrders(Collections.singletonList(order));

    }
}
