class RailwayStation {

    String stationName;
    String city;
    boolean isOperational;
    Train train;

    public void getRailwayStationDetails() {
	
        System.out.println("The Railway Station Details Are:");
        System.out.println("The Station Name is: " + stationName);
        System.out.println("The City is: " + city);
        System.out.println("Is Operational: " + isOperational);

        this.train.getTrainDetails();
    }
}