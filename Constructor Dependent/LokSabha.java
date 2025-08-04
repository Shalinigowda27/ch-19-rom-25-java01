class LokSabha {

    String houseName;
    String location;
    boolean isInSession;
    Seat seat;

    public void getLokSabhaDetails() {
	
        System.out.println("The LokSabha Details Are:");
        System.out.println("House name: " + houseName);
        System.out.println("Location: " + location);
        System.out.println("Is in session: " + isInSession);

        this.seat.getSeatDetails();
    }
}
