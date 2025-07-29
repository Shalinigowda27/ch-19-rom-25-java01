class King {

    String name;
    String dynasty;
    int reignYears;
    String kingdom;
    String spouse;
    int reignStart;
    int reignEnd;
	String knownFor;
	
	public void getKingInfo(){
	
	    System.out.println("\nKing Details:");
        System.out.println("Name: " + name);
        System.out.println("Kingdom: " + kingdom);
        System.out.println("Reign Start: " + reignStart + " BC");
        System.out.println("Reign End: " + reignEnd + " BC");
        System.out.println("Known For: " + knownFor);
}
}