class GymEquipments {

    GymEquipments(){
        System.out.println("GymEquipments Cons is invoked")
    }

    String equipmentName;
    String brand;
    double price;
    String type;
    String material;
    double weight;
	String color;
	
	public void getGymEquipmentsInfo(){
	
	    System.out.println("Equipment Name: " + equipmentName);
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Color: " + color);
		

}
}