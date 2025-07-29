class Marble {

	Marble(){
        System.out.println("Marble Cons is invoked");
	}

    String color;
    int size;
    int weight;
    String material;
	String pattern;

	public void getMarbleInfo(){

        System.out.println("Marble Details:");
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Weight: " + weight);
        System.out.println("Material: " + material);
        System.out.println("Pattern: " + pattern);
		}
}