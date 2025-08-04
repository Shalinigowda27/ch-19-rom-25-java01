class GalaxyRunner{

	public static void main(String[] args){
	
	Galaxy galaxy = new Galaxy();
	SolarSystem solarSystem = new SolarSystem();
	Planet planet = new Planet();
	
	galaxy.galaxyName = "Milky Way";
	galaxy.galaxyLocation = "We live in it";
	galaxy.isGalaxyVisible = true;
	galaxy.solarSystem = solarSystem;
	
	solarSystem.solarSystemName = "Solar System";
    solarSystem.isLifePossible = true;
    solarSystem.noOfPlanets = 8;
    solarSystem.ageInBillionYears = 4.6;
    solarSystem.hasAsteroidBelt = true;
    solarSystem.planet = planet;
	
	planet.planetName = "Earth";
    planet.planetDiameter = 12742; 
	planet.hasAtmosphere = true;
	
	galaxy.getGalaxyDetails();	
	
	}
}