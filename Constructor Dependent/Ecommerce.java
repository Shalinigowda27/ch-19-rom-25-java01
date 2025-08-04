class Ecommerce {

    String platformName;
    String websiteURL;
    boolean isActive;
    Category category;

    public void getEcommerceDetails() {

        System.out.println("The Ecommerce Details Are:");
        System.out.println("Platform Name: " + platformName);
        System.out.println("Website URL: " + websiteURL);
        System.out.println("Is Active: " + isActive);

        this.category.getCategoryDetails();
    }
}