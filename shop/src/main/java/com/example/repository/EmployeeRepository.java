package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	  public List<Employee> findByEmail(String email); 
	  public List<Employee> findByFirstName(String name);
	  public List<Employee> findByFirstNameContaining(String name);
	  public List<Employee> findByFirstNameOrFirstNameLikeOrderByEmployeeIdDesc(String lowChar, String uppChar);
	  
	  @Query("select em from employee em where em.firstName like %?1%")
	  public List<Employee> findByFirstLike(String likeStr);
	  
	  @Query("select em from employee em where em.firstName like %:likeStr% and em.firstName like %:secondStr%")
	  public List<Employee> findByFirstParam(String likeStr, String secondStr);
}
