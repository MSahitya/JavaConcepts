package org.example.NewFeatures;


import java.util.List;

record Product(int id, String name, double price, String category) {}



public class OrderProcessor_Record {

    public double calculateTotal(List<Product> products) {
        return products.stream().mapToDouble(Product::price).sum();
    }

    public String generateOrderSummary(List<Product> products) {
        StringBuilder summary = new StringBuilder("Order Summary:\n");
        for (Product product : products) {
            summary.append(String.format("- %s (%s): $%.2f\n", product.name(), product.category(), product.price()));
        }
        summary.append(String.format("Total: $%.2f", calculateTotal(products)));
        return summary.toString();
    }

    public void processOrder(List<Product> products, String customerEmail) {
        double total = calculateTotal(products);
        String orderSummary = generateOrderSummary(products);

        // Simulate sending an email confirmation
        System.out.println("Sending order confirmation to: " + customerEmail);
        System.out.println(orderSummary);
        System.out.println("Total Amount: $"+ total);

        // Simulate persisting the order to a database.
        // In a real application, you would use a database or other persistent storage.

        System.out.println("Order processed and saved.");
    }

    public static void main(String[] args) {
        List<Product> orderItems = List.of(
                new Product(1, "Laptop", 1200.00, "Electronics"),
                new Product(2, "Mouse", 25.00, "Accessories"),
                new Product(3, "Keyboard", 50.00, "Accessories")
        );

        OrderProcessor_Record processor = new OrderProcessor_Record();
        processor.processOrder(orderItems, "customer@example.com");
    }
}