class Country{

	String countryName;
    String countryContinent;
    boolean isCountryDeveloped;
    State state;
	
	public void getCountryDetails() {
	
        System.out.println("The Country Details Are:");
        System.out.println("The country name is " + countryName);
        System.out.println("The country continent is " + countryContinent);
        System.out.println("Is country developed: " + isCountryDeveloped);

        this.state.getStateDetails();
    }
}