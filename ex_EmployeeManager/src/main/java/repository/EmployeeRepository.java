/*
 * EMPLOYEE REPOSITORY DOES
 * 
 * how to setup our CRUD repository
 * extends it from the JpaRepository
 * 
 * */

package repository;

import entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>{
	
}
 