class Radio {
    static String radioName;
    static String radioColor;
	static int    radioPrice;
	static String radioBrandName;
	static double radioBandLength;
	
	static boolean isRadioWarrantyAvailable;
	
    public static String getRadioName() {
        radioName = "XXX";
        return radioName;
    }
	public static String getColor(){
		radioColor = "Black";
		return radioColor;
	}
	public static int getPrice(){
		radioPrice = 10000;
		return radioPrice;
	}
	public static String getRadioBrandName(){
		radioBrandName = "Boat";
		return radioBrandName;
	}
	public static double getBandLength(){
		radioBandLength = 109.00;
		return radioBandLength;
	}
	public static boolean isRadioWarrantyAvailable(){
		isRadioWarrantyAvailable = true;
		return isRadioWarrantyAvailable;
	}
	


public static void getInfo(){
	System.out.println("The name of the radio is "+ radioName);
	System.out.println("The color of the radio is "+ radioColor);
	System.out.println("The price of the radio is "+ radioPrice);
	System.out.println("The brand of the radio is "+ radioBrandName);
	System.out.println("The bandlength of the radio is "+ radioBandLength);
	System.out.println("The warranty of the radio is "+ isRadioWarrantyAvailable);
	
}
}