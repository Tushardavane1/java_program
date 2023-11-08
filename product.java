public class product {
    private int productId;
    private String productName;
    private double productCost;
    private int productQuantity;

    // Static variable to keep track of the number of objects created
    private static int objectCount = 0;

    // Default constructor
    public product() {
        objectCount++; // Increment object count when a new object is created
    }

    // Parameterized constructor
    public product(int productId, String productName, double productCost, int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
        this.productQuantity = productQuantity;
        objectCount++; // Increment object count when a new object is created
    }

    // Display the contents of the object
    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Cost: " + productCost);
        System.out.println("Product Quantity: " + productQuantity);
    }

    // Display the object count
    public static void displayObjectCount() {
        System.out.println("Total number of objects created: " + objectCount);
    }

    public static void main(String[] args) {
        // Create objects of the Product class
        product product1 = new product();
        product product2 = new product(101, "Laptop", 999.99, 5);

        // Display the contents of each object
        System.out.println("Product 1:");
        product1.displayProduct();

        System.out.println("\nProduct 2:");
        product2.displayProduct();

        // Display the object count
        product.displayObjectCount();
    }
}

