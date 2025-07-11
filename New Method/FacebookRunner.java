class FacebookRunner {

	public static void main(String args[]){
	
	
	String firstName = Facebook.getFirstName();
	System.out.println("The user firstName is "+ firstName);
	
	String firstName = Facebook.getSurName();
	System.out.println("The user surName is "+ surName);
	
	String firstName = Facebook.getDateOfBirth();
	System.out.println("The user dateOfBirth is "+ dateOfBirth);
	
	String firstName = Facebook.getgender();
	System.out.println("The user gender is "+ gender);
	
	long firstName = Facebook.getMobileNumber();
	System.out.println("The user MobileNumber is "+ MobileNumber);
	
	String firstName = Facebook.getEmail();
	System.out.println("The user email is "+ email);
	
	System.out.println("Is User Registered "+ userIsRegistered);	
	
	Facebook.getUserInfo();
	}
}