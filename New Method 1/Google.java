class Google {

	static String firstName;
	static String middleName;
	static String lastName;
	static String gender;
	static long   mobileNumber;
	static String email;
	static String dateOfBirth;
	static String password;
	static String confirmPassword;

	public static boolean loginUser(String fName, String mName, String lName, String gndr, long mNumber, String eml, String dOfBirth, String pwd, String cPwd);
		boolean isUserLogined       = false;
		boolean firstNameValid      = false;
		boolean middleNameValid     = false;
		boolean lastNameValid       = false;
		boolean genderValid         = false;
		boolean mobileNumberValid   = false;
		boolean emailValid          = false;
		boolean dateOfBirthValid    = false;
		boolean passwordValid       = false;
		boolean confirmPasswordValid = false;
		
		//null != null;
	if(fName != null){	
		firstName = fName;
		firstNameValid = true;
	}	
	else
	{
		System.out.println("Given firstName is not valid ");
	}

    if(mName != null){	
		middleName = mName;
		middleNameValid = true;
	}	
	else
	{
		System.out.println("Given middleName is not valid ");
	}
	
	if(lName != null){	
		lastName = lName;
		lastNameValid = true;
	}	
	else
	{
		System.out.println("Given lastName is not valid ");
	}
	
    if(gndr != null){	
		gender = gndr;
		genderValid = true;
	}	
	else
	{
		System.out.println("Given gender is not valid ");
	}

    if(mNumber != null){	
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
	
	if(dOfBirth != null){	
		dateOfBirth = dOfBirth;
		dateOfBirthValid = true;
	}	
	else
	{
		System.out.println("Given dateOfBirth is not valid ");
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
	
	if(firstNameValid && middleNameValid && lastNameValid && genderValid && mobileNumberValid && emailValid && dateOfBirthValid && passwordValid && confirmPasswordValid){
		System.out.println("All the ref(firstName, middleName, gender, mobileNumber, email, dateOfBirth, password, confirmPassword)");
		isUserLogined = true;
	}	
	return isUserLogined;	
	}
	public static void getUserInfo(){	
		System.out.println("The first Name is "+ firstName);
		System.out.println("The middle Name is "+ middleName);
		System.out.println("The gender is "+ gender);
		System.out.println("The mobile Number is "+ mobileNumber);
		System.out.println("The email is "+ email);
		System.out.println("The date Of Birth is "+ dateOfBirth);
		System.out.println("The password is "+ password);
		System.out.println("The confirmPassword is "+ confirmPassword);		
   }
	
	
}