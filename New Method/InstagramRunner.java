class InstagramRunner  {

	public static void main(String[] args){
	
		boolean userIsRegistered = Instagram.registerUser("Rocking Star", "Yash", "Yash08");

	System.out.println("Is User Registered "+ userIsRegistered);	
	
	Instagram.getUserInfo();

		
	}
}