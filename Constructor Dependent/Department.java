class Department{

	String departmentName;
	int    noOfDepartments;
	boolean isEmergencyAvailable;
	Doctor doctor;
	
	public void getDepartmentDetails(){
	
	System.out.println("The department name is "+ departmentName);
	System.out.println("The total number of departments are "+ noOfDepartments);
	System.out.println("Is emergency available "+ isEmergencyAvailable);
	
	this.doctor.getDoctorDetails();
	
	}
}