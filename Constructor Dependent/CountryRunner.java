class CountryRunner {

    public static void main(String[] args) {

        Country country = new Country();
        State state = new State();
        City city = new City();

        country.countryName = "India";
        country.countryContinent = "Asia";
        country.isCountryDeveloped = false;
        country.state = state;

        state.stateName = "Karnataka";
        state.statePopulation = 68000000;
		state.stateCapital = "Bengaluru";
        state.isStateCoastal = true;
        state.city = city;

        city.cityName = "Bengaluru";
		city.cityLocation = "Rajajinagar";
        city.isCityCapital = true;

        country.getCountryDetails();
    }
}
