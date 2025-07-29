class Casino {
	
    String name;
    String location;
    int numberOfGames;
    String owner;
    String licenseNumber;
    int slots;
	boolean vipRoom;
	
	public void getCasinoInfo(){
	
	    System.out.println("\nCasino Details:");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Slots: " + slots);
        System.out.println("VIP Room: " + vipRoom);
        System.out.println("Owner: " + owner);
	
        
}
}