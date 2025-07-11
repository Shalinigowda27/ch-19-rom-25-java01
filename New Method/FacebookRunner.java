class FacebookRunner {

	public static void main(String args[]){
	
	boolean userIsRegistered = Facebook.registerUser("Ravi", "Gowda", "19-06-2007", "Male", 9874563281L, "ravi@gmail.com");
	
	System.out.println("Is User Registered "+ userIsRegistered);	
		Facebook.getUserInfo();

	}
}
