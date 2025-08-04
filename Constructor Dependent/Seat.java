class Seat {

    String seatName;
    int seatNumber;
    boolean isReserved;
    Politician politician;

    public void getSeatDetails() {
	
        System.out.println("The Seat Details Are:");
        System.out.println("Seat name: " + seatName);
        System.out.println("Seat number: " + seatNumber);
        System.out.println("Is reserved: " + isReserved);

        this.politician.getPoliticianDetails();
    }
}
