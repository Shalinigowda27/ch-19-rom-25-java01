class Screen{

	String screenName;
	int    totalSeats;
	int     bookedSeats;
	int    noOfScreens;
	Movie movie;
	
	public void getScreenDetails(){
	
	System.out.println("The screen details are:");
	System.out.println("The screen name is "+ screenName);
	System.out.println("The total seats are "+ totalSeats);
	System.out.println("The booked seats are "+ bookedSeats);
	System.out.println("The number of screen are "+ noOfScreens);
	
	this.movie.getMovieDetails();
	
	}

}