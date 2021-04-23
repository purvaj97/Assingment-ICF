package assingmentICF.service;

import java.util.List;

import assingmentICF.models.EResult;
import assingmentICF.models.Employee;





public interface ServiceInterfaceEmp {
	
	EResult addEmp(Employee e);
	EResult updateEmp(Employee e);
	EResult removeEmp(int empno);
	EResult getEmp(int empno);
	List<Employee> getAllDetails();

}
