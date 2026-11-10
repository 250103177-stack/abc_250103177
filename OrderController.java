/**
 * Client Class: OrderController
 * Demonstrates how client code interacts with the subsystem via the Facade.
 */
public class OrderController {

    public static void main(String[] args) throws IllegalAccessException {
        // Step 1: Create a single instance of the Facade
        CheckoutFacade checkout = new CheckoutFacade();

        // Step 2: Define order request parameters
        String item = "Laptop-X1";
        String customer = "user_404";
        String address = "123 Main St";
        double price = 1200.00;
        boolean is_suspicous = true;

        // Step 3: Call the simplified one-method facade interface
        System.out.println("Client initiating checkout via Facade...");
        boolean success = checkout.placeOrder(is_suspicous, item, customer, address, price);

        // Step 4: Handle high-level outcome
        if (success) {
            System.out.println("Client received: Order completed successfully!");
        } else {
            System.out.println("Client received: Order failed.");
        }
    }
}
