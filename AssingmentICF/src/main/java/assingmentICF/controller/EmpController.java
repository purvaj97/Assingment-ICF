package assingmentICF.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import assingmentICF.models.EResult;
import assingmentICF.models.Employee;
import assingmentICF.service.ServiceInterfaceEmp;



@CrossOrigin(origins = "http://localhost:8081")
@RestController
public class EmpController {
	@Autowired
	ServiceInterfaceEmp s;

	@GetMapping("/abc")
	public String test() {
		return ("hello test working go ahed");
	}

	@PutMapping("/addemp")
	public EResult addEmp(@RequestBody Employee e) {
		EResult er = s.addEmp(e);
		return er;
		/*
		  System.out.println("insert  is" + e); 
		  EResult cr =new EResult(1,null,"insttest"); return cr;
		 */
	}

	@PostMapping("/updateemp")
	public EResult updateEmp(@RequestBody Employee e) {
		EResult er = s.updateEmp(e);
		return er;
		/*
		 System.out.println("update  is" + e); 
		  EResult cr =new EResult(1,null,"upttest"); 
		  return cr;
		 */
	}

	@DeleteMapping("/removeemp")
	public EResult removeEmp(@RequestParam("x") int empno) {
		EResult er = s.removeEmp(empno);
		return er;
		
		/*
		System.out.println("remove  is" + empno);
		EResult cr =new EResult(1,null,"removtest");
		return cr;
		*/
	}

	@GetMapping("/singleselect")
	public EResult getEmp(@RequestParam("empId") int empId) {
		EResult er = s.getEmp(empId);
		return er;
		
		/*
		System.out.println("single select  is" + empno);
		EResult cr =new EResult(1,new Emp(1, "pqr", 20),"singletest");
		return cr
		*/
	}

	@GetMapping("/multiselect")
	public List<Employee> mulss() {
		List<Employee> l = s.getAllDetails();
		return l;
		/*
		List<Emp> l =new ArrayList<>();
		l.add(new Emp(10,"A",3));
		return l;
		*/
	}


}
