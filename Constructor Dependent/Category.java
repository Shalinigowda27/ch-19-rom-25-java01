class Category {

    String categoryName;
    int numberOfProducts;
    Product product;

    public void getCategoryDetails() {
	
        System.out.println("Category Details:");
        System.out.println("Category Name: " + categoryName);
        System.out.println("Number of Products: " + numberOfProducts);

        this.product.getProductDetails();
    }
}