class WatsappRunner  {

	public static void main(String[] watsapp){
	
	boolean userIsRegistered = Watsapp.registerUser("Virat", "Aryan",  9874563215);
	
	System.out.println("Is User Registered "+ userIsRegistered);	

		Watsapp.getUserInfo();

	
	}
}