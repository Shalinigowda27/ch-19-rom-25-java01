class Swiggy  {

	public static double getFoodPrice(String foodName) {
        double price = 0.0;
		
			if(foodName == "Burger"){
				price = 59.00;
			} 
			else if(foodName == "Pizza")
			{
				price = 99.00;
			} 
			else if(foodName == "Roll")
			{
				price = 89.00;
			} 
			else if(foodName == "Chicken Biryani")
			{
				price = 120.00;
			} 
			else if(foodName == "Veg Biryani")
			{
				price = 100.00;
			} 
			else if(foodName == "Mutton Biryani")
			{
				price = 150.00;
			} 
			else if(foodName == "Chicken kabab")
			{
				price = 110.00;
			} 
			else if(foodName == "Mutton Chops")
			{
				price = 149.00;
			} 
			else if(foodName == "Mutton Cheema")
			{
				price = 200.00;
			} 
			else if(foodName == "Mutton Sambar")
			{
				price = 159.00;
			} 
			else if(foodName == "Mutton Gheeroast")
			{
				price = 250.00;
			} 
			else if(foodName == "Panner Butter Masala")
			{
				price = 150.00;
			} 
			else if(foodName == "Chicken Curry")
			{
				price = 129.00;
			} 
			else if(foodName == "panner curry")
			{
				price = 99.00;
			} 
			else
			{
				System.out.println(foodName + " food not found");	
			}
			
			return price;
}
}
