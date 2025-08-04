class PVRRunner{

	public static void main(String args[]){
	
	PVR pvr = new PVR();
	Screen  screen = new Screen();
	Movie movie = new Movie();
	
	pvr.pvrName = "PVR IMAX";
	pvr.pvrLocation = "RajajiNagar";
	pvr.isPvrOpen = false;
	pvr.screen = screen;
	
	screen.screenName = "Gold Class";
	screen.totalSeats = 100;
	screen.bookedSeats = 60;
	screen.noOfScreens = 3;
	screen.movie = movie;
	
	movie.movieName = "SU From SO";
	movie.genre = "Comedy";
	movie.durationInHour = 3;
	movie.isShowStarted = true;
	
	pvr.getPVRDetails();
	
	
	}
}