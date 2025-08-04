class Galaxy{

	String galaxyName;
	String galaxyLocation;
	boolean isGalaxyVisible;
	SolarSystem solarSystem;
	
	public void getGalaxyDetails(){
	
	System.out.println("The Galaxy Details Are:");
	System.out.println("The galaxy name is "+ galaxyName);
	System.out.println("The galaxy location is "+ galaxyLocation);
	System.out.println("Is galaxy visible "+ isGalaxyVisible);
	
	this.solarSystem.getSolarSystemDetails();
	
	}
}