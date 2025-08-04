class HospitalRunner{

	public static void main(String args[]){
	
	Hospital hospital = new Hospital();
	Department  department = new Department();
	Doctor doctor = new Doctor();
	
	hospital.hospitalName = "Sparsh";
	hospital.hospitalAddress = "Bangaluru";
	hospital.noOfBranches = 4;
	hospital.isHospitalOpen = true;
	hospital.department = department;
	
	department.departmentName = "Cardiology";
	department.noOfDepartments = 10;
	department.isEmergencyAvailable = true;
	department.doctor = doctor;
	
	doctor.doctorName = "Dr.Karna";
	doctor.specialization = "Cardiology";
	doctor.yearsOfExperience = 5;
	doctor.isDoctorAvailable = false;
	
	hospital.getHospitalDetails();
	
	}
}