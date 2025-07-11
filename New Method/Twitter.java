class Twitter  {

	static String firstName;
	static String middleName;
	static String lastName;
	static String gender;
	
	public static boolean loginUser(String fName, String mName, String lName, String gender){
	
		boolean isUserLogined = false;
		boolean  firstNameValid  = false;
		boolean  middleNameValid = false;
		boolean  lastNameValid   = false;
		boolean  genderValid          = false;
		
		if(fName != null){             
			firstName = fName;
			firstNameValid = true;
		}
		if(mName != null){
			middleName   = mName;
		    middleNameValid = true;
		}
		
		if(lName != null){
			lastName   = lName;
		    lastNameValid = true;
		}
		
		if(gender != null){
			gender   = gender;
		    genderValid = true;
		}
		
		if(firstNameValid == true && middleNameValid == true && lastNameValid == true && genderValid == true){
			isUserLogined = true;
		}
		
	
	return isUserLogined;	
	}

	public static void getUserInfo(){
	System.out.println("the first Name is "+ firstName);
	System.out.println("the middle Name is "+ middleName);
	System.out.println("the last Name is "+ lastName);	
	System.out.println("the gender is "+ gender);	

	
	}
}