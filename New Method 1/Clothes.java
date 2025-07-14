class Clothes  {

	static String brandName         = "ZARA";
	static String fabricType        = "Cotton";
	static String shirtSize         = "L";
	static int    pantSize          = 30;
	static int    noOfShirts        = 5;
	static int    noOfPants         = 5;
	static String gender            = "Male";
	static String colour            = "White";
	
	boolean isMaterialGood = false;
	
	public static String getBrandName(){
		return brandName;
	}
	
	public static String getFabricType(){
		return fabricType;
	}
	
	public static String getShirtSize(){
		return shirtSize;
	}
	
	public static int getPantSize(){
		return pantSize;
	}
	
	public static int getNoOfShirts(){
		return noOfShirts;
	}
	
	public static int getNoOfPants(){
		return noOfPants;
	}
	
	public static String getGender(){
		return gender;
	}
	
	public static String getColour(){
		return colour;
	}
	
	public static boolean getLoggedIn(){
	boolean isMaterialGood = true;
	return isMaterialGood;
	}
	
public static void getInfo(){
	System.out.println("The brandName of the cloth is "+ brandName);
	System.out.println("The fabricType of the cloth is "+ fabricType);
	System.out.println("The shirtSize of the cloth is "+ shirtSize);
	System.out.println("The pantSize of the cloth is "+ pantSize);
	System.out.println("The noOfShirts available is "+ noOfShirts);
	System.out.println("The noOfPants available is "+ noOfPants);
	System.out.println("The gender is "+ gender);
	System.out.println("The colour of the radio is "+ colour);
}
}
	
