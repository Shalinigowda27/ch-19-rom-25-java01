class PrimeMinister {

    String name;
    int termYears;
    CabinetMinister cabinetMinister;

    public void getPrimeMinisterDetails() {
	
        System.out.println("Prime Minister Details:");
        System.out.println("The Prime Minister Name is: " + name);
        System.out.println("The Total Term Years: " + termYears);

        this.cabinetMinister.getCabinetMinisterDetails();
    }
}