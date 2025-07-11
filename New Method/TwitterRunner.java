class TwitterRunner   {

	public static void main(String twitter[]){
	
	boolean userIsLogined = Twitter.loginUser("Virat", "Aryan", "Kumar", "Male");
	
	System.out.println("Is User Logined "+ userIsLogined);	
		Twitter.getUserInfo();

		
	}
}