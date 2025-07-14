class RedditRunner {

	public static void main(String args[]){
	
	boolean userIsRegistered = Reddit.registerUser("Gowri", "05-06-2004", "Female", 7874563281L, "gowri@gmail.com", "Gowri05", "Gowri05");
	
	System.out.println("Is User Registered "+ userIsRegistered);	
	
	if(userIsRegistered)Reddit.getUserInfo();
	}
}
