class ForestSafari {

	ForestSafari(){
		System.out.println("Forest Safari Cons is invoked");
	}

    String name;
    String location;
    String duration;
    String type;
	double price;
	
	public void getForestSafariInfo(){
	
	    System.out.println("Safari Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Duration: " + duration);
        System.out.println("Type: " + type);
        System.out.println("Price: $" + price);
  }
  }