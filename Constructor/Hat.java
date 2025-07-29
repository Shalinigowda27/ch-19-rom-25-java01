class Hat {

	Hat(){
		System.out.println("Hat Cons is invoked");
	}

    String brand;
    String material;
    String size;
    String color;
	String type;
	
	public void getHatInfo(){
	
	    System.out.println("\nHat Details:");
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
        System.out.println("Brand: " + brand);
}
}