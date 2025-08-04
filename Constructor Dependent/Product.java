class Product {

    String productName;
    double price;
    boolean isAvailable;

    public void getProductDetails() {
	
        System.out.println("Product Details:");
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Is Available: " + isAvailable);
    }
}