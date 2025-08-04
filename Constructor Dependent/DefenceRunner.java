class DefenceRunner {

    public static void main(String[] args) {

        Defence defence = new Defence();
        Army army = new Army();
        Squad squad = new Squad();

        defence.branchName = "Indian Army";
        defence.country = "India";
        defence.isActive = true;
        defence.army = army;

        army.divisionName = "Infantry Division";
        army.totalSoldiers = 1200;
        army.squad = squad;

        squad.squadName = "Alpha Squad";
        squad.membersCount = 10;
        squad.mission = "Border Patrol";

        defence.getDefenceDetails();
    }
}
