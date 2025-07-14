class SpotifyRunner{


	public static void main(String[] spot){



	String name = SpotifyAccount.getFirstName();
	System.out.println("The first name is " + name);

	String lname = SpotifyAccount.getLastName();
	System.out.println("The last name is " + lname);

	String	 fName =  SpotifyAccount.getFullName();
	System.out.println("The full name is " + fName);

	int ag = SpotifyAccount.getAge();
	System.out.println("The age is " + ag);

	int playlist = SpotifyAccount.getPlayLists();
	System.out.println("The song available are " + playlist);

	double hr = SpotifyAccount.getHour();
	System.out.println("The hour of  song available are " + hr);

	float rating = SpotifyAccount.getRating();
	System.out.println("The rating got is  " + rating);

	char gender = SpotifyAccount.getGender();
	System.out.println("The gender is " + gender);

	long phNo = SpotifyAccount.getPhNo();
	System.out.println("The phone number is  " + phNo);

	boolean isLoggedIn = SpotifyAccount.getLoggedIn();
	System.out.println("The user is  " + isLoggedIn);
	}
}




