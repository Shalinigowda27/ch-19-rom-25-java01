class MajesticRunner {

    public static void main(String[] args) {

        Majestic majestic = new Majestic();
        BusStand busStand = new BusStand();
        Platform platform = new Platform();

        majestic.areaName = "Majestic";
        majestic.city = "Bangalore";
        majestic.isOperational = true;
        majestic.busStand = busStand;

        busStand.standName = "Central Bus Stand";
        busStand.numberOfPlatforms = 12;
        busStand.platform = platform;

        platform.platformNumber = 5;
        platform.route = "Majestic to Electronic City";
        platform.isActive = true;

        majestic.getMajesticDetails();
    }
}
