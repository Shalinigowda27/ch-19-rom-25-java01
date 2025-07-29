class CourtCase {

    String caseNumber;
    String type;
    String status;
    String judge;
    int year;
    String judgeName;
    String courtName;

	public void getCourtCaseInfo(){

        System.out.println("\nCourt Case Details:");
        System.out.println("Case Number: " + caseNumber);
        System.out.println("Type: " + type);
        System.out.println("Year: " + year);
        System.out.println("Judge Name: " + judgeName);
        System.out.println("Status: " + status);
}
}