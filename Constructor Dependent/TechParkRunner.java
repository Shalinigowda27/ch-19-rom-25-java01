class TechParkRunner {

    public static void main(String[] args) {

        TechPark techPark = new TechPark();
        Block block = new Block();
        Company company = new Company();

        techPark.techParkName = "Manyata Tech Park";
        techPark.techParkLocation = "Bangalore";
        techPark.isTechParkOperational = true;
        techPark.block = block;

        block.blockName = "Block A";
        block.totalFloors = 10;
        block.hasCafeteria = true;
        block.company = company;

        company.companyName = "Infosys";
        company.employeeCount = 5000;
        company.isHiring = true;

        techPark.getTechParkDetails();
    }
}
