class TechPark {

    String techParkName;
    String techParkLocation;
    boolean isTechParkOperational;
    Block block;

    public void getTechParkDetails() {
	
        System.out.println("The TechPark Details Are:");
        System.out.println("The tech park name is " + techParkName);
        System.out.println("The tech park location is " +techParkLocation);
		System.out.println("Is tech park operational: " + isTechParkOperational);

        this.block.getBlockDetails();
    }
}