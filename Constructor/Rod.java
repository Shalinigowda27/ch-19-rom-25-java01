class Rod {

	Rod(){
	    System.out.println("Rod Cons is invoked");
	}

    String material;
    double length;
    String purpose;
    String color;
    double thickness;
    double diameter;
    double weight;
	
	public void getRodInfo(){
	
	    System.out.println("\nRod Details:");
        System.out.println("Material: " + rod1.material);
        System.out.println("Length: " + rod1.length);
        System.out.println("Diameter: " + rod1.diameter);
        System.out.println("Color: " + rod1.color);
        System.out.println("Weight: " + rod1.weight);
}
}