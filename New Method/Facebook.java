class Facebook {

	static String firstName;
	static String surName;
	static String dateOfBirth;
	static String gender;
	static long   mobileNumber;
	static String email;

	public static boolean registerUser(String fName, String sName, String dOfBirth, String gender, long mNumber, String email){
		boolean isUserRegistered    = false;
		boolean firstNameValid      = false;
		boolean surNameValid        = false;
		boolean dateOfBirthValid    = false;
		boolean genderValid         = false;
		boolean mobileNumberValid   = false;
		boolean emailValid          = false;
		
	if(fName != null){	
		firstName = fName;
		firstNameValid = true;
	}	
	
	if(sName != null){
		surName = sName;
		surNameValid = true;	
	}
	
	if(dOfBirth != null){
		dateOfBirth = dOfBirth;
		dateOfBirthValid = true;
	}
	
	if(gender != null){
		gender = gender;
		genderValid = true;
}
	
	if(mNumber != 0){
		mobileNumber = mNumber;
		mobileNumberValid = true;
	}
	
	if(email != null){
		email = email;
		emailValid = true;
	}
	
	if(firstNameValid == true && surNameValid == true && dateOfBirthValid == true && genderValid == true && mobileNumberValid == true && emailValid == true){
		isUserRegistered = true;
	}
	
	return isUserRegistered;
	
	}

	public static void getUserInfo(){
	
		System.out.println("The first Name is "+ firstName);
		System.out.println("The sur Name is "+ surName);
		System.out.println("The date Of Birth is "+ dateOfBirth);
		System.out.println("The gender is "+ gender);
		System.out.println("The mobile Number is "+ mobileNumber);
		System.out.println("The email is "+ email);
   }
}

