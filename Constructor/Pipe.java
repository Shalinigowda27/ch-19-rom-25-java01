class Pipe {

	Pipe(){
		System.out.println("Pipe Cons is invoked");
	}

    String material;
    double diameter;
    double length;
    String usage;
    String color;

	public void Pipe(){
        
		System.out.println("\nPipe Details:");
        System.out.println("Material: " + material);
        System.out.println("Length: " + length);
        System.out.println("Diameter: " + diameter);
        System.out.println("Color: " + color);
        System.out.println("Usage: " + usage);
	}
}