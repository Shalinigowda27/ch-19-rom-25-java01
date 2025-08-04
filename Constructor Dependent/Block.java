class Block {

    String blockName;
    int totalFloors;
    boolean hasCafeteria;
    Company company;

    public void getBlockDetails() {
	
        System.out.println("The Block Details Are:");
        System.out.println("The block name is " + blockName);
        System.out.println("Total floors: " + totalFloors);
        System.out.println("Has cafeteria: " + hasCafeteria);

        this.company.getCompanyDetails();
    }
}
