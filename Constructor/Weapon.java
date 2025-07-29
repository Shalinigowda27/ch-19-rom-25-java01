class Weapon {

	Weapon(){
		System.out.println("Weapon Cons is invoked");
	}

    String type;
    String name;
    String material;
    double weight;
    String range;
    String origin;
	
	public void getWeaponInfo(){
	
	    System.out.println("\nWeapon Details:");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight);
        System.out.println("Material: " + material);
        System.out.println("Origin: " + origin);
	}
}