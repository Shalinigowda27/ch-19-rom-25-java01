class PassportSeva1 {
	static String givenName ;
	static String surName ; 
    static String password;
    static String confirmPassword;
 
public static boolean  registerUser(String gName , String sName, String pwd, String cPwd){
boolean   isUserRegistered = false;

	
	
	boolean  userValidator = PassportUserValidator.validatePassportUser(gName ,  sName, pwd, cPwd);
	if (userValidator){
		System.out.println("User validated");
	  isUserRegistered=true;
	}
	else
		System.out.println("User not validated");
   
return  isUserRegistered; 
}


public static void getUserInfo(){
	givenName=PassportUserValidator.givenName;
	surName=PassportUserValidator.surName;
	password=PassportUserValidator.password;
	confirmPassword=PassportUserValidator.confirmPassword;
	
System.out.println("The given Name is "+ givenName);
System.out.println ("The Sur Name is "+ surName);
System.out.println ("The password is "+ password);
System.out.println ("The confirmPassword is "+ confirmPassword);
}
}