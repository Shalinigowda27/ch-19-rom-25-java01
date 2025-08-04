class RailwayStationRunner {

    public static void main(String[] args) {

        RailwayStation railwayStation = new RailwayStation();
        Train train = new Train();

        railwayStation.stationName = "Central Station";
        railwayStation.city = "Mumbai";
        railwayStation.isOperational = true;
        railwayStation.train = train;

        train.trainName = "Rajdhani Express";
        train.trainNumber = 12345;
        train.destination = "New Delhi";

        railwayStation.getRailwayStationDetails();
    }
}
