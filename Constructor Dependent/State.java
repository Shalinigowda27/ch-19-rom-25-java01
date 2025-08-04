class State {

    String stateName;
	int     statePopulation;
    String stateCapital;
    boolean isStateCoastal;
	City    city;
	
    public void getStateDetails() {

        System.out.println("The State Details Are:");
        System.out.println("The state name is " + stateName);
        System.out.println("The total number of state population is " + statePopulation);		
        System.out.println("The state capital is " + stateCapital);
        System.out.println("Is state coastal: " + isStateCoastal);
		
        this.city.getCityDetails();
    }
}
