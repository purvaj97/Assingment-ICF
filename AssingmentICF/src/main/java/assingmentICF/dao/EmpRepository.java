package assingmentICF.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import assingmentICF.models.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {

	}

