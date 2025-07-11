class Watsapp   {

	static String  userName;
	static String  nickName;
	static String    mobileNumber;
	
	public static boolean registeruser(String uName, String nName, String mNumber){
	
		boolean isUserRegistered = false;
		boolean userNameValid    = false;
		boolean nickNameValid    = false;
		boolean mobileNumberValid = false;
		
		if(uName != null){             
			userName = uName;
			userNameValid = true;
		}
		
		if(nName != null){             
			nickName = nName;
			nickNameValid = true;
		}
		
		if(mNumber != null && mobileNumber.length == 10){             
		}
		
		if(userNameValid == true && nickNameValid == true && mobileNumberValid == true){
			isUserRegistered = true;
		}
	
	return isUserRegistered;	
	}

	public static void getUserInfo(){
	System.out.println("the user Name is "+ userName);
	System.out.println("the nick Name is "+ nickName);
	System.out.println("the mobileNumber is "+ mobileNumber);	
	
}
}