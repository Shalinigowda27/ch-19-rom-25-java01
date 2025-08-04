class CabinetMinister {

    String ministerName;
    String portfolio;
    boolean isCurrentlyServing;

    public void getCabinetMinisterDetails() {
	
        System.out.println("Cabinet Minister Details:");
        System.out.println("The Cabinet Minister Name: " + ministerName);
        System.out.println("The Portfolio: " + portfolio);
        System.out.println("Is Currently Serving: " + isCurrentlyServing);
    }
}