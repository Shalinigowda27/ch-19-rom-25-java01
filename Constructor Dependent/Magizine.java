class Magizine{
 
	String magazineName;
    String publisher;
    int    noOfIssuesPerYear;
    boolean isMonthlyPublishing;
	
	
	public void getMagizineInfo(){
	
	System.out.println("The magazine name is "+ magazineName);
	System.out.println("The publisher name is "+ publisher);
	System.out.println("The number of issue per year "+ noOfIssuesPerYear);
	System.out.println("Is it monthly publishing "+ isMonthlyPublishing);
	
	this.page.getPageInfo();
	
	}

}