class ChartgptRunner {

	public static void main(String args[]){
	
	boolean userIsRegistered = Chartgpt.registerUser("Vilas", "Naik", "U", "17-09-2003", "Male", 9894563281L, "vilas@gmail.com");
	
	System.out.println("Is User Registered "+ userIsRegistered);	
	
	if(userIsRegistered)Chartgpt.getUserInfo();
	}
}
