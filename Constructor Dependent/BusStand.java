class BusStand {

    String standName;
    int numberOfPlatforms;
    Platform platform;

    public void getBusStandDetails() {
	
        System.out.println("Bus Stand Details:");
        System.out.println("Stand Name: " + standName);
        System.out.println("Number of Platforms: " + numberOfPlatforms);

        this.platform.getPlatformDetails();
    }
}
