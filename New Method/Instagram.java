class Instagram  {

	static String fullName;
	static String userName;
	static String password;

	public static boolean registerUser(String fName, String uName, String password){
	
		boolean isUserRegistered  = false;
		boolean fullNameValid     = false;
		boolean userNameValid     = false;
		boolean passwordValid     = false;
		
		
	if(fName != null){
		fullName = fName;
		fullNameValid = true;
	}	
	
	if(uName != null){
		userName = uName;
		userNameValid = true;
	}
	
	if(password != null){
		password = password;
		passwordValid = true;
	}
	
	if(fullNameValid == true && userNameValid == true && passwordValid == true){
		isUserRegistered = true;		
	}
	return isUserRegistered;
	}
	
	public static void getUserInfo(){
	
		System.out.println("The full Name is "+ fullName);
		System.out.println("The user Name is "+ userName);
		System.out.println("The password is "+ password);

	}	
}