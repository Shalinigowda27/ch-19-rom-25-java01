class Hotel{

	String hotelName;
	String ownerName;
	int    noOfWorkers;
    Floor floor;
	
	//custom / object references
	
	public void getHotelDetails(){
	
	System.out.println("Hotel detail is been fetched");
	
	this.floor.getFloorDetails();
	}
}

