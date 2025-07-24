class DominosPizzaRunner {

    public static void main(String[] args) {
	
        String pizzaName = "Spicy Jenkins";
		
        int price = DominosPizza.takeOrder(pizzaName);
		
        System.out.println("The price  for " + pizzaName + " is: " + price);
		
		int quantity = 2;
		int priceWithQuantity = DominosPizza.takeOrder(pizzaName, quantity);
		
		System.out.println("The Price for " + pizzaName + " with quantity "+quantity+" is: " + priceWithQuantity);
	}
}
