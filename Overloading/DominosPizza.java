class DominosPizza   {

	public static int takeOrder(String pizzaName){
		int price = 0;
		
	if (pizzaName == "Margherita") 
		{
            price = 50;
        } 	
	else if (pizzaName == "Farmhouse") 
		{
            price = 69;
        } 	
	else if (pizzaName == "Peppy Paneer") 
		{
            price = 75;
        } 	
    else if (pizzaName == "Mexican Green Wave") 
		{
            price = 85;
        } 			
	else if (pizzaName == "Deluxe Veggie") 
		{
            price = 95;
        } 	
	else if (pizzaName == "Veg Extravaganza") 
		{
            price = 99;
        } 	
	else if (pizzaName == "Cheese n Corn") 
		{
            price = 100;
        } 	
	else if (pizzaName == "Fresh Veggie") 
		{
            price = 109;
        } 	
	else if (pizzaName == "Veggie Paradise") 
		{
            price = 65;
        } 
	else if (pizzaName == "Paneer Makhani") 
		{
            price = 99;
        } 	
	else if (pizzaName == "Indi Tandoori Paneer") 
		{
            price = 105;
        } 	
	else if (pizzaName == "Chicken Sausage") 
		{
            price = 110;
        } 	
	else if (pizzaName == "Chicken Fiesta") 
		{
            price = 115;
        } 	
	else if (pizzaName == "Chicken Dominator") 
		{
            price = 120;
        } 	
	else if (pizzaName == "Non‑Veg Supreme") 
		{
            price = 125;
        } 	
	else if (pizzaName == "Chicken Golden Delight") 
		{
            price = 130;
        } 	
	else if (pizzaName == "Indi Chicken Tikka") 
		{
            price = 135;
        } 	
	else if (pizzaName == "Chicken Pepperoni") 
		{
            price = 140;
        } 	
	else if (pizzaName == "Smoked Chicken Gourmet") 
		{
            price = 145;
        } 	
	else if (pizzaName == "Pepper Barbecue") 
		{
            price = 150;
        } 	
	else if (pizzaName == "Blazing Chicken") 
		{
            price = 160;
        } 	
	else if (pizzaName == "Moroccan Spice Pasta") 
		{
            price = 165;
        } 
	else if (pizzaName == "Cheese & Barbeque Chicken") 
		{
            price = 170;
        } 
	else if (pizzaName == "Chicken Salami") 
		{
            price = 175;
        } 
	else if (pizzaName == "Tomato Pizza") 
		{
            price = 180;
        }
	else if (pizzaName == "Onion Pizza") 
		{
            price = 185;
        } 
	else if (pizzaName == "Veg Loaded Pizza") 
		{
            price = 195;
        } 
	else if (pizzaName == "Cheesy Pizza") 
		{
            price = 200;
        } 
	else if (pizzaName == "Capsicum Pizza") 
		{
            price = 199;
        } 
	else if (pizzaName == "Golden Corn Pizza") 
		{
            price = 205;
        } 
	else if (pizzaName == "Paneer & Onion Pizza") 
		{
            price = 209;
        } 
	else if (pizzaName == "Cheese & Tomato Pizza") 
		{
            price = 210;
        } 
	else if (pizzaName == "Moroccan Spice Pasta – Veg") 
		{
            price = 205;
        } 
	else if (pizzaName == "Creamy Tomato Pasta Pizza") 
		{
            price = 111;
        } 
	else if (pizzaName == "Unthinkable Pizza") 
		{
            price = 215;
        } 
	else if (pizzaName == "Kadhai Paneer Pizza") 
		{
            price = 220;
        } 
	else if (pizzaName == "The Unthinkable") 
		{
            price = 225;
        } 
	else if (pizzaName == "The 5‑Cheese Gourmet") 
		{
            price = 230;
        } 
	else if (pizzaName == "Cheese Dominator") 
		{
            price = 235;
        } 
	else if (pizzaName == "The 4 Cheese Pizza") 
		{
            price = 250;
        } 
	else if (pizzaName == "Marinated Paratha Pizza") 
		{
            price = 299;
        } 
	else if (pizzaName == "Achari Do Pyaza") 
		{
            price = 349;
        } 
	else if (pizzaName == "Stuffed‑Crust Pizza") 
		{
            price = 399;
        } 
	else if (pizzaName == "Rachel’s Sweet Buffalo") 
		{
            price = 599;
        } 
	else if (pizzaName == "Double Cheesy") 
		{
            price = 499;
        }
	else if (pizzaName == "Spicy Volcano") 
		{
            price = 405;
        } 
	else if (pizzaName == "Spicy Jenkins") 
		{
            price = 495;
        } 
	else if (pizzaName == "Hearty Pizza") 
		{
            price = 699;
        } 
	else if (pizzaName == "Cheeseburger Pizza") 
		{
            price = 799;
        } 
	else if (pizzaName == "Domino’s TikTok Pizza") 
		{
            price = 999;
        } 
		else
		{
            System.out.println(price + " invalid ");
        }

        return price;	
	}
	
	public static int takeOrder(String pizzaName, int quantity){
		int price = 0;
		
	if (pizzaName == "Margherita") 
		{
            price = 50*quantity;
			return price;
        } 	
	else if (pizzaName == "Farmhouse") 
		{
            price = 69*quantity;
			return price;
        } 	
	else if (pizzaName == "Peppy Paneer") 
		{
            price = 75*quantity;
			return price;
        } 	
    else if (pizzaName == "Mexican Green Wave") 
		{
            price = 85*quantity;
			return price;
        } 			
	else if (pizzaName == "Deluxe Veggie") 
		{
            price = 95*quantity;
			return price;
        } 	
	else if (pizzaName == "Veg Extravaganza") 
		{
            price = 99*quantity;
			return price;
        } 	
	else if (pizzaName == "Cheese n Corn") 
		{
            price = 100*quantity;
			return price;
        } 	
	else if (pizzaName == "Fresh Veggie") 
		{
            price = 109*quantity;
			return price;
        } 	
	else if (pizzaName == "Veggie Paradise") 
		{
            price = 65*quantity;
			return price;
        } 
	else if (pizzaName == "Paneer Makhani") 
		{
            price = 99*quantity;
			return price;
        } 	
	else if (pizzaName == "Indi Tandoori Paneer") 
		{
            price = 105*quantity;
			return price;
        } 	
	else if (pizzaName == "Chicken Sausage") 
		{
            price = 110*quantity;
			return price;
        } 	
	else if (pizzaName == "Chicken Fiesta") 
		{
            price = 115*quantity;
			return price;
        } 	
	else if (pizzaName == "Chicken Dominator") 
		{
            price = 120*quantity;
			return price;
        } 	
	else if (pizzaName == "Non‑Veg Supreme") 
		{
            price = 125*quantity;
			return price;
        } 	
	else if (pizzaName == "Chicken Golden Delight") 
		{
            price = 130*quantity;
			return price;
        } 	
	else if (pizzaName == "Indi Chicken Tikka") 
		{
            price = 135*quantity;
			return price;
        } 	
	else if (pizzaName == "Chicken Pepperoni") 
		{
            price = 140*quantity;
			return price;
        } 	
	else if (pizzaName == "Smoked Chicken Gourmet") 
		{
            price = 145*quantity;
			return price;
        } 	
	else if (pizzaName == "Pepper Barbecue") 
		{
            price = 150*quantity;
			return price;
        } 	
	else if (pizzaName == "Blazing Chicken") 
		{
            price = 160*quantity;
			return price;
        } 	
	else if (pizzaName == "Moroccan Spice Pasta") 
		{
            price = 165*quantity;
			return price;
        } 
	else if (pizzaName == "Cheese & Barbeque Chicken") 
		{
            price = 170*quantity;
			return price;
        } 
	else if (pizzaName == "Chicken Salami") 
		{
            price = 175*quantity;
			return price;
        } 
	else if (pizzaName == "Tomato Pizza") 
		{
            price = 180*quantity;
			return price;
        }
	else if (pizzaName == "Onion Pizza") 
		{
            price = 185*quantity;
			return price;
        } 
	else if (pizzaName == "Veg Loaded Pizza") 
		{
            price = 195*quantity;
			return price;
        } 
	else if (pizzaName == "Cheesy Pizza") 
		{
            price = 200*quantity;
			return price;
        } 
	else if (pizzaName == "Capsicum Pizza") 
		{
            price = 199*quantity;
			return price;
        } 
	else if (pizzaName == "Golden Corn Pizza") 
		{
            price = 205*quantity;
			return price;
        } 
	else if (pizzaName == "Paneer & Onion Pizza") 
		{
            price = 209*quantity;
			return price;
        } 
	else if (pizzaName == "Cheese & Tomato Pizza") 
		{
            price = 210*quantity;
			return price;
        } 
	else if (pizzaName == "Moroccan Spice Pasta – Veg") 
		{
            price = 205*quantity;
			return price;
        } 
	else if (pizzaName == "Creamy Tomato Pasta Pizza") 
		{
            price = 111*quantity;
			return price;
        } 
	else if (pizzaName == "Unthinkable Pizza") 
		{
            price = 215*quantity;
			return price;
        } 
	else if (pizzaName == "Kadhai Paneer Pizza") 
		{
            price = 220*quantity;
			return price;
        } 
	else if (pizzaName == "The Unthinkable") 
		{
            price = 225*quantity;
			return price;
        } 
	else if (pizzaName == "The 5‑Cheese Gourmet") 
		{
            price = 230*quantity;
			return price;
        } 
	else if (pizzaName == "Cheese Dominator") 
		{
            price = 235*quantity;
			return price;
        } 
	else if (pizzaName == "The 4 Cheese Pizza") 
		{
            price = 250*quantity;
			return price;
        } 
	else if (pizzaName == "Marinated Paratha Pizza") 
		{
            price = 299*quantity;
			return price;
        } 
	else if (pizzaName == "Achari Do Pyaza") 
		{
            price = 349*quantity;
			return price;
        } 
	else if (pizzaName == "Stuffed‑Crust Pizza") 
		{
            price = 399*quantity;
			return price;
        } 
	else if (pizzaName == "Rachel’s Sweet Buffalo") 
		{
            price = 599*quantity;
			return price;
        } 
	else if (pizzaName == "Double Cheesy") 
		{
            price = 499*quantity;
			return price;
        }
	else if (pizzaName == "Spicy Volcano:") 
		{
            price = 405*quantity;
			return price;
        } 
	
	else if (pizzaName == "Spicy Jenkins") 
		{
            price = 495*quantity;
			return price;
        } 
	else if (pizzaName == "Hearty Pizza") 
		{
            price = 699*quantity;
			return price;
        } 
	else if (pizzaName == "Cheeseburger Pizza") 
		{
            price = 799*quantity;
			return price;
        } 
	else if (pizzaName == "Domino’s TikTok Pizza") 
		{
            price = 999*quantity;
			return price;
        } 
		else
		{
            System.out.println(price + " invalid ");
        }

        return price;	
	}
}