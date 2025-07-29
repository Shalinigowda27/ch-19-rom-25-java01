class HairClip {
	
	HairClip(){
		System.out.println("HairClip Cons is invoked");
	}
	
    String color;
    String size;
    String material;
    double price;
    String brand;
    String type;
	
	public void getHairClipInfo(){
	
	System.out.println("Hair Clip Details:");
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
        System.out.println("Price: $" + price);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);

	}
}