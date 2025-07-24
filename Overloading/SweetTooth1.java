class SweetTooth1 {
    public static int takeOrder(String sweetName) {
        int price = 0;

        if (sweetName == "Gulab Jamun") 
		{
            price = 40;
        } 
		else if (sweetName == "Rasgulla") 
		{
            price = 45;
        } 
		else if (sweetName == "Kaju Katli") 
		{
            price = 120;
        } 
		else if (sweetName == "Mysore Pak") 
		{
            price = 60;
        } 
		else if (sweetName == "Jalebi")
		{
            price = 50;
        }
		else if (sweetName == "Motichoor Laddu") 
		{
            price = 55;
        } 
		else if (sweetName == "Rasmalai") 
		{
            price = 90;
        }
		else if (sweetName == "Peda") 
		{
            price = 70;
        } 
		else if (sweetName == "Badam Halwa") 
		{
            price = 100;
        } 
		else if (sweetName == "Sandesh") 
		{
            price = 80;
        } 
		else if (sweetName == "Kesar Barfi")
		{
            price = 110;
        }
		else if (sweetName == "Chum Chum") 
		{
            price = 60;
        } 
		else if (sweetName == "Besan Laddu")
		{
            price = 50;
        }
		else if (sweetName == "Halwa")
		{
            price = 90;
        } 
		else if (sweetName == "Milk Cake") 
		{
            price = 85;
        }
		else if (sweetName == "Dry Fruit Laddu")
		{
            price = 120;
        } 
		else if (sweetName == "Soan Papdi")
		{
            price = 45;
        } 
		else if (sweetName == "Coconut Barfi") 
		{
            price = 70;
        }
		else if (sweetName == "Boondi Laddu") 
		{
            price = 40;
        } 
		else
		{
            System.out.println(price + " invalid ");
        }

        return price;
	}

    public static int takeOrder(String sweetName, int quantity) {
        int price = 0;

        if (sweetName == "Gulab Jamun") 
		{
            price = 40*quantity;
			return price;
        } 
		else if (sweetName == "Rasgulla")
		{
            price = 45*quantity;
			return price;
        } 
		else if (sweetName == "Kaju Katli") 
		{
            price = 120*quantity;
			return price;
        } 
		else if (sweetName == "Mysore Pak") 
		{
            price = 60*quantity;
			return price;
        } 
		else if (sweetName == "Jalebi") 
		{
            price = 50*quantity;
			return price;
        } 
		else if (sweetName == "Motichoor Laddu") 
		{
            price = 55*quantity;
			return price;
        } 
		else if (sweetName == "Rasmalai") 
		{
            price = 90*quantity;
			return price;
        } 
		else if (sweetName == "Peda") 
		{
            price = 70*quantity;
			return price;
        } 
		else if (sweetName == "Badam Halwa") 
		{
            price = 100*quantity;
			return price;
        } 
		else if (sweetName == "Sandesh") 
		{
            price = 80*quantity;
			return price;
        } 
		else if (sweetName == "Kesar Barfi") 
		{
            price = 110*quantity;
			return price;
        } 
		else if (sweetName == "Chum Chum") 
		{
            price = 60*quantity;
			return price;
        } 
		else if (sweetName == "Besan Laddu") 
		{
            price = 50*quantity;
			return price;
        } 
		else if (sweetName == "Halwa") 
		{
            price = 90*quantity;
			return price;
        } 
		else if (sweetName == "Milk Cake") 
		{
            price = 85*quantity;
			return price;
        } 
		else if (sweetName == "Dry Fruit Laddu") 
		{
            price = 120*quantity;
			return price;
        } 
		else if (sweetName == "Soan Papdi") 
		{
            price = 45*quantity;
			return price;
        } 
		else if (sweetName == "Coconut Barfi") 
		{
            price = 70*quantity;
			return price;
        }
		else if (sweetName == "Boondi Laddu") 
		{
            price = 40*quantity;
			return price;
        } 
		else 
		{
            System.out.println(price + " invalid ");
        }

        return price;
	}
}
