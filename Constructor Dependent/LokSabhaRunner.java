class LokSabhaRunner {

    public static void main(String[] args) {

        LokSabha lokSabha = new LokSabha();
        Seat seat = new Seat();
        Politician politician = new Politician();

        lokSabha.houseName = "17th Lok Sabha";
        lokSabha.location = "New Delhi";
        lokSabha.isInSession = true;
        lokSabha.seat = seat;

        seat.seatName = "Bangalore South";
        seat.seatNumber = 23;
        seat.isReserved = false;
        seat.politician = politician;

        politician.politicianName = "Tejasvi Surya";
        politician.party = "BJP";
        politician.isCabinetMinister = false;

        lokSabha.getLokSabhaDetails();
    }
}
