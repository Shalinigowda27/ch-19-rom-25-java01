class Pmo {

    String officeName;
    String location;
    boolean isFunctional;
    PrimeMinister primeMinister;

    public void getPmoDetails() {
	
        System.out.println("The PMO Details Are:");
        System.out.println("The Pmo Office Name: " + officeName);
        System.out.println("The Pmo Location: " + location);
        System.out.println("Is Functional: " + isFunctional);

        this.primeMinister.getPrimeMinisterDetails();
    }
}