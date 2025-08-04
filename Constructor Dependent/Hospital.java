class Hospital{

	String hospitalName;
	String hospitalAddress;
	int    noOfBranches;
	boolean isHospitalOpen; 
	Department department;
	
	public void getHospitalDetails(){
	
	System.out.println("The hospital details are: ");
	System.out.println("The hospital name is "+ hospitalName);
	System.out.println("The hospital address is "+ hospitalAddress);
	System.out.println("The number of branches are "+ noOfBranches);
	System.out.println("Is hospital open now "+ isHospitalOpen);

	this.department.getDepartmentDetails();
	}
}