class EcommerceRunner {

    public static void main(String[] args) {

        Ecommerce ecommerce = new Ecommerce();
        Category category = new Category();
        Product product = new Product();

        ecommerce.platformName = "ShopEasy";
        ecommerce.websiteURL = "www.shopeasy.com";
        ecommerce.isActive = true;
        ecommerce.category = category;

        category.categoryName = "Electronics";
        category.numberOfProducts = 150;
        category.product = product;

        product.productName = "Wireless Headphones";
        product.price = 2999.99;
        product.isAvailable = true;

        ecommerce.getEcommerceDetails();
    }
}
