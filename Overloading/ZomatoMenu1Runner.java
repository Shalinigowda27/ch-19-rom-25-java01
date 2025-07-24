class ZomatoMenu1Runner {

    public static void main(String[] args) {
	
        String foodName = "Chicken Biryani";
		
        int price = ZomatoMenu1.getFoodPrice(foodName);
		
        System.out.println("The price  for " + foodName + " is: " + price);
		
		int quantity = 3;
		int priceWithQuantity = ZomatoMenu1.getFoodPrice(foodName, quantity);
		
		System.out.println("The Price for " + foodName + " with quantity "+quantity+" is: " + priceWithQuantity);
	}
}
