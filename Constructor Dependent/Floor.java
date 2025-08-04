class Floor{

	int floorNo;
	boolean isLiftAvailable;
	Room room;
	
	public void getFloorDetails(){
	
	System.out.println("Fetching floor info....");
	System.out.println("The floor number is "+ floorNo);
	System.out.println("Is lift available "+ isLiftAvailable);
	
	this.room.getRoomDetails();
	
	}

}