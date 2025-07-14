class Wikipedia {

	static String fullName;
	static String surName;
	static String dateOfBirth;
	static String gender;
	static long   mobileNumber;
	static String email;
	static String password;
	static String confirmPassword;

	public static boolean registerUser(String fName, String sName, String dOfBirth, String gndr, long mNumber, String eml, String pwd, String cPwd){
		boolean isUserRegistered    = false;
		boolean fullNameValid      = false;
		boolean surNameValid        = false;
		boolean dateOfBirthValid    = false;
		boolean genderValid         = false;
		boolean mobileNumberValid   = false;
		boolean emailValid          = false;
		boolean passwordValid       = false;
		boolean confirmPasswordValid = false;
		
	//null != null;	
	if(fName != null){	
		fullName = fName;
		fullNameValid = true;
	}	
	else
	{
		System.out.println("Given fullName is not valid ");
	}
	
	if(sName != null){
		surName = sName;
		surNameValid = true;	
	}
	else
	{
		System.out.println("Given surName is not valid ");
	}
	
	if(dOfBirth != null){
		dateOfBirth = dOfBirth;
		dateOfBirthValid = true;
	}
	else
	{
		System.out.println("Given dateOfBirth is not valid ");
	}
	
	if(gndr != null){
		gender = gndr;
		genderValid = true;
    }
	else
	{
		System.out.println("Given gender is not valid ");
	}
	
	if(mNumber != 0){
		mobileNumber = mNumber;
		mobileNumberValid = true;
	}
	else
	{
		System.out.println("Given mobileNumber is not valid ");
	}
	
	if(eml != null){
		email = eml;
		emailValid = true;
	}
	else
	{
		System.out.println("Given email is not valid ");
	}
	
	if(pwd != null){
		password = pwd;
		passwordValid = true;
	}
	else
	{
		System.out.println("Given password is not valid ");
	}
	
	if(cPwd != null && pwd == cPwd){
		confirmPassword = cPwd;
		confirmPasswordValid = true;
	}
	else
	{
		System.out.println("Given confirmPassword is not valid ");
	}
	
	if(fullNameValid && surNameValid && dateOfBirthValid && genderValid && mobileNumberValid && emailValid && passwordValid && confirmPasswordValid){
		System.out.println("All the ref(fullName, surName, dateOfBirth, gender, mobileNumber, email, password, confirmPassword)");
		isUserRegistered = true;
	}	
	return isUserRegistered;	
	}
	public static void getUserInfo(){	
		System.out.println("The full Name is "+ fullName);
		System.out.println("The sur Name is "+ surName);
		System.out.println("The date Of Birth is "+ dateOfBirth);
		System.out.println("The gender is "+ gender);
		System.out.println("The mobile Number is "+ mobileNumber);
		System.out.println("The email is "+ email);
		System.out.println("The password is "+ password);
		System.out.println("The confirmPassword is "+ confirmPassword);		
   }
}