class Gemini {

	static String firstName;
	static String middleName;
	static String lastName;
	static String dateOfBirth;
	static String gender;
	static long   mobileNumber;
	static String email;

	public static boolean registerUser(String fName, String mName, String lName, String dOfBirth, String gndr, long mNumber, String eml){
		boolean isUserRegistered    = false;
		boolean firstNameValid      = false;
		boolean middleNameValid     = false;
		boolean lastNameValid       = false;
		boolean dateOfBirthValid    = false;
		boolean genderValid         = false;
		boolean mobileNumberValid   = false;
		boolean emailValid          = false;
		
		
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
	
	if(firstNameValid && middleNameValid && lastNameValid && dateOfBirthValid && genderValid && mobileNumberValid && emailValid){
		System.out.println("All the ref(firstName, middleName, lastName, dateOfBirth, gender, mobileNumber, email)");
		isUserRegistered = true;
	}	
	return isUserRegistered;	
	}
	public static void getUserInfo(){	
		System.out.println("The first Name is "+ firstName);
		System.out.println("The middle Name is "+ middleName);
		System.out.println("The last Name is "+ lastName);		
		System.out.println("The date Of Birth is "+ dateOfBirth);
		System.out.println("The gender is "+ gender);
		System.out.println("The mobile Number is "+ mobileNumber);
		System.out.println("The email is "+ email);
		
   }
}