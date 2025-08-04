class Movie{

	String movieName;
	String genre;
	int    durationInHour;
	boolean isShowStarted;
	
	
	public void getMovieDetails(){
	
	System.out.println("The movie details are: ");
	System.out.println("The movie name is "+ movieName);
	System.out.println("The movie genre is "+ genre);
	System.out.println("The movie duration in hour is "+ durationInHour);
	System.out.println("Is the movie show started "+ isShowStarted);
	
}
}