class PmoRunner {

    public static void main(String[] args) {

        Pmo pmo = new Pmo();
        PrimeMinister primeMinister = new PrimeMinister();
        CabinetMinister cabinetMinister = new CabinetMinister();

        pmo.officeName = "Prime Minister's Office";
        pmo.location = "New Delhi";
        pmo.isFunctional = true;
        pmo.primeMinister = primeMinister;

        primeMinister.name = "Narendra Modi";
        primeMinister.termYears = 2;
        primeMinister.cabinetMinister = cabinetMinister;

        cabinetMinister.ministerName = "Amit Shah";
        cabinetMinister.portfolio = "Home Affairs";
        cabinetMinister.isCurrentlyServing = true;

        pmo.getPmoDetails();
    }
}
