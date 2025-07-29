class Fish {

	Fish(){
		System.out.println("Fish Cons is invoked");
	}
    String species;
    String habitat;
    double size;
	String color;
	
	public void getFishInfo(){
	
	    System.out.println("Species: " + species);
        System.out.println("Habitat: " + habitat);
        System.out.println("Size: " + size + " cm");
        System.out.println("Color: " + color);
}		
}