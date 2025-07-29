class Politician {

	Politician(){
		System.out.println("Politician Cons is invoked");
	}

    String name;
    String party;
    int age;
    String constituency;
    String position;
	String state;
	
	public void getPoliticianInfo(){
	
        System.out.println("\nPolitician Details:");
        System.out.println("Name: " + name);
        System.out.println("Party: " + party);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
        System.out.println("State: " + state);	
		}
}