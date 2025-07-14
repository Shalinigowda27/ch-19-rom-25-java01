class WikipediaRunner {

	public static void main(String args[]){
	
	boolean userIsRegistered = Wikipedia.registerUser("Bhavana", "Gowda", "05-06-2004", "Female", 7874563281L, "bhavana@gmail.com", "Bhavu05", "Bhavu05");
	System.out.println("Is User Registered "+ userIsRegistered);	
	
	if(userIsRegistered)Wikipedia.getUserInfo();
	}
}
