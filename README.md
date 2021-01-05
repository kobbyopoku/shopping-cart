# shopping-cart

When shopping for groceries online a Customer chooses a Product and places an Order for some quantity of it.
The order is added to a Cart. A Date is set for the delivery. More orders can be added to the cart, and they can be changed up until checking out.
It is possible for products to have a discount rate applied, i.e. a DiscountProduct. The contents of the shopping cart can be sorted in various ways. 
Orders within a cart can be iterated over. To support further features of the cart, orders and associated products can be tested for equality.

## UC1
A test program that creates an instance of Cart, populates it with several orders (for both products and discount products), and uses a for-each loop to produce a formatted listing of the orders with their price, the number of items in the cart and the overall total price.
Note: You can either use a data file to dynamically read orders, or hardcode the order instances to add to the cart.


## UC2
Test each of the sort methods work as expected, as evidenced by appropriate output.
    -- For the sortOrders(Comparator<Order>) method, you should pass in a custom comparator that sorts by cost (asc) and if these are the same then by product (desc).


## UC3
Additionally, test the use of equality by using the contains and remove methods. Also, you should use a PrintWriter to produce a receipt for all of the orders and associated details of the cart, and output these into a text file Cart.txt.


## UC4
Add further code to show how each method of Cart can be used. In particular, increase and/or decrease the quantity of one or more of the products in the cart, and then re-print the updated cart listing.


## UC5
Create an instance of RewardProcessor, add a selection of products to it (but not all the same as those in your cart), and then test the rewardPoints method appropriately.


## UC6
Create four different Order object instances and ensure each has a different price policy – default, buy 1 get 1 free, buy 2 get 1 free, and buy 5 get 1 free.
Calculate the cost of each to show the price policies are being applied correctly, and test each policy with different quantities.
