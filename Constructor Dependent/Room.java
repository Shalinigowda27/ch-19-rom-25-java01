class Room{

	String roomSize;
	int    roomNo;
	String type;
	boolean isBalconyAvailable;
	String bedType;
	
	
	public void getRoomDetails(){
		System.out.println("The Room details are: ");
		System.out.println("The room size is "+ roomSize);
		System.out.println("The room number is "+ roomNo);
		System.out.println("The room type is "+ type);
		System.out.println("Is balcony available "+ isBalconyAvailable);
		System.out.println("The bed type is "+ bedType);
	}
}


