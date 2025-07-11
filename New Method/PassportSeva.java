class PassportSeva{
	
	static String givenName = Ravi;
	static String surName = Acchu;

	public static boolean registerUser(String gName, String sName){
	
		boolean isUserRegistered = false;
		boolean givenNameValid = false;
		boolean  surNameValid = false;
		
		if(gName != null){             //!= means should not equal to
			givenName = gName;
			givenNameValid = true;
		}
		if(sName != null){
			surName   = sName;
		    surNameValid = true;
		}
		
		if(givenNameValid == true && surNameValid == true){
			isUserRegistered = true;
		}
		
	
	return isUserRegistered;	
	}

	public static void getUserInfo(){
	System.out.println("the given Name is "+ givenName);
	System.out.println("the sur Name is "+ surName);
	}
}









