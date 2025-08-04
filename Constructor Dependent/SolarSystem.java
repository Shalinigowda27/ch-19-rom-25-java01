class SolarSystem{

	String solarSystemName;
    boolean isLifePossible;
    int     noOfPlanets;
    double ageInBillionYears;
    boolean hasAsteroidBelt;
    Planet planet;
	
	public void getSolarSystemDetails(){
	
	System.out.println("The Solar System Details Are:");
	System.out.println("The solar system name is "+ solarSystemName);
	System.out.println("Is life possible in solar system "+ isLifePossible);
	System.out.println("Total number of planets are "+noOfPlanets);
	System.out.println("The age in billion years "+ ageInBillionYears);
	System.out.println("Has asteroid belt is "+ hasAsteroidBelt);
	
	this.planet.getPlanetDetails();
	}
}