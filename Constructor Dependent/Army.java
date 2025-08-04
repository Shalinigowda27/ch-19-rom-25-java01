class Army {

    String divisionName;
    int totalSoldiers;
    Squad squad;

    public void getArmyDetails() {
	
        System.out.println("The Army Details Are:");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Total Soldiers: " + totalSoldiers);

        this.squad.getSquadDetails();
    }
}
