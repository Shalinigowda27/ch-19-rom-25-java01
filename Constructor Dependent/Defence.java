class Defence {

    String branchName;
    String country;
    boolean isActive;
    Army army;

    public void getDefenceDetails() {
	
        System.out.println("The Defence Details Are:");
        System.out.println("Branch Name: " + branchName);
        System.out.println("Country: " + country);
        System.out.println("Is Active: " + isActive);

        this.army.getArmyDetails();
    }
}
