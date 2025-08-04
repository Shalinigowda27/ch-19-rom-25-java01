class PVR{

	String pvrName;
	String pvrLocation;
	boolean isPvrOpen;
	Screen screen;
	
	public void getPVRDetails(){
	
	System.out.println("The PVR details are:");
	System.out.println("The PVR name is "+ pvrName);
	System.out.println("The PVR location is "+ pvrLocation);
	System.out.println("Is PVR open today "+ isPvrOpen);
	
	this.screen.getScreenDetails();
	
	}
}