class SwiggyMenuRunner {
    public static void main(String[] args) {
	
        String SwiggyOrders = "Burger";
		
		double price = SwiggyMenu.getFoodPrice(foodName);
		
		System.out.println("The price of "+foodName+" is " + price);
		
		double quantity = 2;
		
        double priceWithQuantity = SwiggyMenu.getFoodPrice(foodName);
		
        System.out.println("The Price for " + foodName + " with quantity "+quantity+" is: " + priceWithQuantity);
	}
}



//Method overloading