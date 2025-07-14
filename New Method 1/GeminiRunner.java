class GeminiRunner {

	public static void main(String args[]){
	
	boolean userIsRegistered = Gemini.registerUser("Aryan", "Virat", "A", "17-09-1995", "Male", 9894563281L, "aryan@gmail.com");
	
	System.out.println("Is User Registered "+ userIsRegistered);	
	
	if(userIsRegistered)Gemini.getUserInfo();
	}
}
