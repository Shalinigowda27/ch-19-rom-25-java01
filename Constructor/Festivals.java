class Festivals {

	Festivals(){
		System.out.println("Festivals Cons is invoked");
	
	}

    String name;
    String location;
    String date;
    String type;
    String description;
	int    duration;
	
	public void getFestivalsInfo(){
	
	    System.out.println("Festival Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Type: " + type);
        System.out.println("Description: " + description);
        System.out.println("Duration: " + duration + " days");
}
}