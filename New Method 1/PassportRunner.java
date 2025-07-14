class PassportRunner {

	public static void main(String args[]){
	
	boolean userIsRegistered = Passport.registerUser("Ravi", "Kiran", "19-06-2007", "Male", 7874563281L, "ravi@gmail.com", "Ravi12", "Ravi12");
	
	System.out.println("Is User Registered "+ userIsRegistered);	
	
	if(userIsRegistered)Passport.getUserInfo();
	}
}
