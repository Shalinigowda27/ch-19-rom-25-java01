class CourtCaseRunner {

    public static void main(String[] args) {


        CourtCase c1 = new CourtCase();
        c1.caseNumber = "C001";
        c1.type = "Civil";
        c1.year = 2020;
        c1.judgeName = "Justice Rao";
        c1.status = "Pending";
		c1.getCourtCaseInfo();


        CourtCase c2 = new CourtCase();
        c2.caseNumber = "C002";
        c2.type = "Criminal";
        c2.year = 2021;
        c2.judgeName = "Justice Mehta";
        c2.status = "Closed";
		c2.getCourtCaseInfo();

       
        CourtCase c3 = new CourtCase();
        c3.caseNumber = "C003";
        c3.type = "Family";
        c3.year = 2019;
        c3.judgeName = "Justice Sharma";
        c3.status = "Appealed";
		c3.getCourtCaseInfo();

        CourtCase c4 = new CourtCase();
        c4.caseNumber = "C004";
        c4.type = "Labor";
        c4.year = 2022;
        c4.judgeName = "Justice Nair";
        c4.status = "Pending";
		c4.getCourtCaseInfo();

        CourtCase c5 = new CourtCase();
        c5.caseNumber = "C005";
        c5.type = "Property";
        c5.year = 2018;
        c5.judgeName = "Justice Khan";
        c5.status = "Judgment Passed";
		c5.getCourtCaseInfo();


        CourtCase c6 = new CourtCase();
        c6.caseNumber = "C006";
        c6.type = "Civil";
        c6.year = 2023;
        c6.judgeName = "Justice Roy";
        c6.status = "Pending";
		c6.getCourtCaseInfo();

        CourtCase c7 = new CourtCase();
        c7.caseNumber = "C007";
        c7.type = "Criminal";
        c7.year = 2020;
        c7.judgeName = "Justice Arjun";
        c7.status = "Appealed";
		c7.getCourtCaseInfo();

        CourtCase c8 = new CourtCase();
        c8.caseNumber = "C008";
        c8.type = "Civil";
        c8.year = 2017;
        c8.judgeName = "Justice Batra";
        c8.status = "Dismissed";
		c8.getCourtCaseInfo();

        CourtCase c9 = new CourtCase();
        c9.caseNumber = "C009";
        c9.type = "Divorce";
        c9.year = 2022;
        c9.judgeName = "Justice Leela";
        c9.status = "Closed";
		c9.getCourtCaseInfo();

        CourtCase c10 = new CourtCase();
        c10.caseNumber = "C010";
        c10.type = "Civil";
        c10.year = 2016;
        c10.judgeName = "Justice Vijay";
        c10.status = "Judgment Passed";
		c10.getCourtCaseInfo();

        CourtCase c11 = new CourtCase();
        c11.caseNumber = "C011";
        c11.type = "Labor";
        c11.year = 2019;
        c11.judgeName = "Justice Anwar";
        c11.status = "Pending";
		c11.getCourtCaseInfo();

        CourtCase c12 = new CourtCase();
        c12.caseNumber = "C012";
        c12.type = "Criminal";
        c12.year = 2015;
        c12.judgeName = "Justice Deepak";
        c12.status = "Appealed";
		c12.getCourtCaseInfo();

        CourtCase c13 = new CourtCase();
        c13.caseNumber = "C013";
        c13.type = "Civil";
        c13.year = 2018;
        c13.judgeName = "Justice Kiran";
        c13.status = "Pending";
		c13.getCourtCaseInfo();

        
        CourtCase c14 = new CourtCase();
        c14.caseNumber = "C014";
        c14.type = "Criminal";
        c14.year = 2021;
        c14.judgeName = "Justice Zoya";
        c14.status = "Closed";
		c14.getCourtCaseInfo();

        CourtCase c15 = new CourtCase();
        c15.caseNumber = "C015";
        c15.type = "Family";
        c15.year = 2023;
        c15.judgeName = "Justice Priya";
        c15.status = "Judgment Passed";
		c15.getCourtCaseInfo();

	}
}
