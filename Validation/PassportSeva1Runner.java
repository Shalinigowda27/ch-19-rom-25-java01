class PassportSeva1Runner {

     public static void main(String seva[]){
	    
		boolean userIsRegistered =   PassportSeva1.registerUser("Baba","Das","abcd","abcd");
	     System.out.println("Is User Registered "+ userIsRegistered);
		 
		 
		    if(userIsRegistered)PassportSeva1.getUserInfo();
	}


}