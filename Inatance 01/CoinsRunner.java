class CoinsRunner {

    public static void main(String[] args) {
		
        Coins coin1 = new Coins();
        coin1.material = "Gold";
        coin1.origin = "India";
        coin1.year = 1990;
        coin1.diameter = 2.5;
        coin1.symbol = "INR";
		coin1.getCoinsInfo();


        Coins coin2 = new Coins();
        coin2.material = "Silver";
        coin2.origin = "USA";
        coin2.year = 1985;
        coin2.diameter = 2.3;
        coin2.symbol = "USD";
		coin2.getCoinsInfo();

        Coins coin3 = new Coins();
        coin3.material = "Copper";
        coin3.origin = "UK";
        coin3.year = 2000;
        coin3.diameter = 2.1;
        coin3.symbol = "GBP";
		coin3.getCoinsInfo();

        Coins coin4 = new Coins();
        coin4.material = "Nickel";
        coin4.origin = "Japan";
        coin4.year = 2010;
        coin4.diameter = 2.2;
        coin4.symbol = "YEN";
		coin4.getCoinsInfo();


        Coins coin5 = new Coins();
        coin5.material = "Bronze";
        coin5.origin = "Germany";
        coin5.year = 1975;
        coin5.diameter = 2.6;
        coin5.symbol = "EUR";
		coin5.getCoinsInfo();
	
	}
}