package assingmentICF.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int empId;
	private String first_Name, last_Name, designation, department, start_Date, end_date, dob, 
	reporting_Manager, gender, bloodGroup, address ;
	
	// [ ID, , , Employment ID, Start Date, , , End
	 //   date, Status, DOB, Reporting Manager, gender, blood group, address]
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String first_Name, String last_Name, String designation, String department,
			String start_Date, String end_date, String dob, String reporting_Manager, String gender, String bloodGroup,
			String address) {
		super();
		this.empId = empId;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.designation = designation;
		this.department = department;
		this.start_Date = start_Date;
		this.end_date = end_date;
		this.dob = dob;
		this.reporting_Manager = reporting_Manager;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getStart_Date() {
		return start_Date;
	}

	public void setStart_Date(String start_Date) {
		this.start_Date = start_Date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getReporting_Manager() {
		return reporting_Manager;
	}

	public void setReporting_Manager(String reporting_Manager) {
		this.reporting_Manager = reporting_Manager;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", first_Name=" + first_Name + ", last_Name=" + last_Name + ", designation="
				+ designation + ", department=" + department + ", start_Date=" + start_Date + ", end_date=" + end_date
				+ ", dob=" + dob + ", reporting_Manager=" + reporting_Manager + ", gender=" + gender + ", bloodGroup="
				+ bloodGroup + ", address=" + address + "]";
	}
	
	
	
	
	

}
