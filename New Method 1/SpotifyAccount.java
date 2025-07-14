class SpotifyAccount{

	static String firstName      = "anu";
	static String lastName       = "d";
	static String fullName       = "anu d";
	static int     age           =  25;
	static int    totalPlayLists = 5;
	static long   phoneNumber    = 9874563210L;
	static double songHour       = 2.5;
	static char   gender         = 'F';
	static float  userRating     = 4.3f;

	boolean isLoggedIn = false;



	public static String getFirstName(){
	return firstName;
	}

	public static String getLastName(){
	return lastName;
	}

	public static String getFullName(){
	return fullName;
	}

	public static int getAge(){
	age = 21;
	return age;
	}

	public static int getPlayLists(){
	return totalPlayLists;	
	}
	
	public static long getPhNo(){
	return phoneNumber;	
	}

	public static char getGender(){
	return gender;
	}

	public static double getHour(){
	return songHour;
	}

	public static float getRating(){
	return userRating;	
	}
	
	public static boolean getLoggedIn(){
	boolean isLoggedIn = true;
	return isLoggedIn;	
	}
  }
