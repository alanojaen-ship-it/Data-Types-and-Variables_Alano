
public class code_tssc {
    public static void main(String[] args) {

        // Declare and initialize variables
        int quantity = 3;
        double unitPrice = 150.50;
        String storeName = "ABC Store";

        // Compute the total cost
        // double is used because the total may
        // contain decimal values (centavos).
        // int cannot store decimal values.
        double totalCost = quantity * unitPrice;

        // Print the itemized summary
        System.out.println("===== SHOPPING RECEIPT =====");
        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: PHP " + unitPrice);
        System.out.println("Total Cost: PHP " + totalCost);
    }
}