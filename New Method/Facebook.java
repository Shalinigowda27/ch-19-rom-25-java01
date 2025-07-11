class Facebook {

	static String firstName  = Shalini;
	static String surName    = Gowda;
	static String dateOfBirth = 27-03-2003;
	static String gender     = Female;
	static long   mobileNumber = 9876543298;
	static String email       = shalu11@gmail.com; 

	public static boolean registerUser(String fName, String sName, String dOfBirth, String gender, long mNumber, String email){
		boolean isUserRegistered    = false;
		boolean firstNameValid      = false;
		boolean surNameValid        = false;
		boolean dateOfBirthValid    = false;
		boolean genderValid         = false;
		boolean mobileNumberValid   = false;
		boolean emailValid          = false;
		
	String getFirstName(){
		return firstName;
	}
	
	String getSurName(){
		return surName;
	}
	
	String getDateOfBirth(){
	    return getGender;
	}
	
	String getMobileNumber(){
		return getMobileNumber;
	}
	String getEmail(){
		return getEmail;
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