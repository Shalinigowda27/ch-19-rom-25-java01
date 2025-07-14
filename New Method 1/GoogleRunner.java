class GoogleRunner {

	public static void main(String args[]){
	
	boolean userIsLogined = Google.loginUser("Shalini", "Gowda", "P", "Male", 7874563281L, "shalu@gmail.com", "27-03-2003", "shalu27", "Shalu27");
	
	System.out.println("Is User Logined "+ userIsLogined);	
	
	if(userIsLogined)Google.getUserInfo();
	}
}



