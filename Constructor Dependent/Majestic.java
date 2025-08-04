class Majestic {

    String areaName;
    String city;
    boolean isOperational;
    BusStand busStand;

    public void getMajesticDetails() {
	
        System.out.println("The Majestic Details Are:");
        System.out.println("Area Name: " + areaName);
        System.out.println("City: " + city);
        System.out.println("Is Operational: " + isOperational);

        this.busStand.getBusStandDetails();
    }
}