class SwiggyRunner {
    public static void main(String[] args) {
        String foodName = "Burger";
        double price = Swiggy.getFoodPrice(foodName);
        System.out.println("The Price for " + foodName + " is: " + price);
	}
}