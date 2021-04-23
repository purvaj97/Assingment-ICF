package assingmentICF.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import assingmentICF.dao.EmpRepository;
import assingmentICF.models.EResult;
import assingmentICF.models.Employee;


@Service
public class ServiceImplementationEmp implements ServiceInterfaceEmp{
	
	@Autowired
	EmpRepository erepo;

	@Override
	public EResult addEmp(Employee e) {
		EResult  er=new EResult(0, e, "failed due to emp");
		Optional<Employee> a=erepo.findById(e.getEmpId());
		if(a.isEmpty()) {
		erepo.save(e);
		er.setStatus(1);
		er.setReason("success");
	} else {
		er.setReason("failed....hey duplicate");
		System.out.println("failed hope duplicate");
	}
	return er;
	}

	@Override
	public EResult updateEmp(Employee e) {
		EResult  er=new EResult(0, e, "failed due to emp");
		if(erepo.existsById(e.getEmpId())) {
			erepo.save(e);
			er.setStatus(1);
			er.setReason("success");
		}
		return er;
	}

	@Override
	public EResult removeEmp(int empId) {
		EResult  er=new EResult(0, null, "failed due to emp");
		try {
			erepo.deleteById(empId);
			er.setStatus(1);
			er.setReason("success");
		} catch (EmptyResultDataAccessException e) {
			
		}
		return er;
	}

	@Override
	public EResult getEmp(int empno) {
		EResult  er=new EResult(0, null, "failed due to emp");
		Optional<Employee> y=erepo.findById(empno);
		if(y.isPresent())
		{
			Employee e = y.get();
			er.setReason("success");
			er.setStatus(1);
			er.setContent(e);
		}
		else
			System.out.println("did not get the object");	
		return er;
	}

	@Override
	public List<Employee> getAllDetails() {
		
		return erepo.findAll();
	}
}
