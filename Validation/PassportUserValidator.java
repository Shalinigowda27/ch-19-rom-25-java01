class  PassportUserValidator{
	
	static String givenName ;
	static String surName ; 
    static String password;
    static String confirmPassword;
public static boolean validatePassportUser(String gName , String sName, String pwd, String cPwd){
	boolean isUserValidated = false;
    boolean givenNameValid = false;
    boolean surNameValid  = false;
	boolean passwordValid = false;
    boolean confirmPasswordValid=false;

 if( gName != null){
		givenName     =   gName  ; 
		givenNameValid        = true ; 
    }else{
		System.out.println("Give the valid  frst Name");
	}

	
    if(sName != null){
		surName       = sName;
		surNameValid = true ; 
    }else{
		System.out.println("provide the valid Sur name please");
    }
	
	
    if(pwd != null){
		password=pwd;
		passwordValid=true;
	}else{
		System.out.println("provide the valid Sur password");
    }
	
	
	if (cPwd != null ){
		confirmPassword=cPwd;
		confirmPasswordValid=true;
	}else{
		System.out.println("provide the valid confirmPassword");
    }
	
	
    if(	 givenNameValid  && surNameValid && passwordValid && confirmPasswordValid && password==confirmPassword){
    isUserValidated  = true;

    }else{
		System.out.println("User does not exist");
    }
	return isUserValidated;
}
}
