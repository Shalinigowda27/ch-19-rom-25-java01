class SweetTooth1Runner {

    public static void main(String[] args) {
	
        String sweetName = "Kaju Katli";
		
        int price = SweetTooth1.takeOrder(sweetName);
		
        System.out.println("The price  for " + sweetName + " is: " + price);
		
		int quantity = 2;
		int priceWithQuantity = SweetTooth1.takeOrder(sweetName, quantity);
		
		System.out.println("The Price for " + sweetName + " with quantity "+quantity+" is: " + priceWithQuantity);
	}
}
