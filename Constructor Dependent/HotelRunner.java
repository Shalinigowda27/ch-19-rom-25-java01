class HotelRunner{

	public static void main(String taj[]){
	
	Hotel hotel = new Hotel();
	Floor floor = new Floor();
	Room room = new Room();
	
	String hotelName = "Taj";
	String ownerName = "Taj Raj";
	int    noOfWorkers = 50;
	
	hotel.hotelName = hotelName;
	hotel.ownerName = ownerName;
	hotel.noOfWorkers = noOfWorkers;
	hotel.floor = floor;
	
	floor.floorNo = 2;
	floor.isLiftAvailable = true;
	floor.room = room;
	
	room.roomSize = "500Sqt";
	room.roomNo = 450;
	room.type = "Single";
	room.isBalconyAvailable = true;
	room.bedType = "Queen";

	//after creating object we need to inject
	
	hotel.getHotelDetails();
	
	}
}