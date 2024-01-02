package com.example.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.example.entity.Employee;

@SpringBootTest
@TestPropertySource(locations = {"classpath:application.properties"})
public class EmployeeRepositoryTest {
	@Autowired
	EmployeeRepository repository;
	
	@Test
	public void repositoryTest() {
		assertNotNull(repository);
	}
	@Test
	@DisplayName("직원 인원 카운트 테스트")
	public void countTest() {
		assertEquals(107, repository.count());
	}
	
	@Test
	@DisplayName("스티븐 조회 테스트")
	public void findByIdTest() {
		Employee emp = repository.findById(100).get();
		System.out.println(emp);
	}
	
	@Test
	@DisplayName("사원테이블 전체 조회 테스트")
	public void findallTest() {
		List<Employee> employees = (List<Employee>) repository.findAll();
		for(Employee emp : employees) {
			System.out.println(emp.toString());
		}
			System.out.println("=============forEach활용===============");
			employees.forEach(emp -> System.out.println(emp));
	}
	
	@Test
	public void saveDeleteTest() {
//		Employee emp = Employee.builder()
//						.DEPARTMENT_ID(90)
//						.EMAIL("abcdefg")
//						.JOB_ID("AD_PRES")
//						.FIRST_NAME("Lee")
//						.LAST_NAME("juheon")
//						.SALARY(15000)
//						.COMMISSION_PCT(null)
//						.MANAGER_ID(101)
//						.PHONE_NUMBER("12345678")
//						.HIRE_DATE(new java.sql.Date(new java.util.Date().getTime()))
//						.build();
//		Employee saveResult = repository.save(emp);
//		Employee getSaveEmployee = repository.findById(saveResult.getEmployeeId()).get();
//		System.out.println("저장된 사원 => " + getSaveEmployee);
//		repository.deleteById(getSaveEmployee.getEmployeeId());	
		Employee getSaveEmployee = repository.findById(207).get();
		System.out.println("209번 사원 => " + getSaveEmployee);
		getSaveEmployee.setEmail("test11");
		getSaveEmployee.setSalary(12345);
		repository.save(getSaveEmployee);
		System.out.println("변경된 사원 => " + getSaveEmployee);		
//		Employee emp2 = new Employee(); emp2.setDEPARTMENT_ID(90);
	}
	
	@Test
	public void userDefineQueryMethodTest() {
		List<Employee> result = repository.findByFirstName("Lee");
		if(result != null) {
			result.forEach(emp -> System.out.println(emp));
//			System.out.println(result.get(0));
		}else {
			System.out.println("조건에 맞는 데이터가 발견되지 않았습니다.");
			//필요한 처리 작업을 해준다.
		}
	}
	
	@Test
	public void userDefineQueryMethodTestTwo() {
		List<Employee> result = repository.findByFirstNameContaining("a");
		if(result != null) {
			result.forEach(emp -> System.out.println(emp));
//			System.out.println(result.get(0));
		}else {
			System.out.println("조건에 맞는 데이터가 발견되지 않았습니다.");
			//필요한 처리 작업을 해준다.
		}
	}
	
	
	@Test
	public void userDefineQueryMethodTestThree() {
		List<Employee> result = repository.findByFirstNameOrFirstNameLikeOrderByEmployeeIdDesc("%a%", "%A%");
		if(result != null) {
			result.forEach(emp -> System.out.println(emp));
//			System.out.println(result.get(0));
		}else {
			System.out.println("조건에 맞는 데이터가 발견되지 않았습니다.");
			//필요한 처리 작업을 해준다.
		}
		System.out.println("=============param=============");
		result = repository.findByFirstParam("A","l");
		if(result != null) {
			result.forEach(emp -> System.out.println(emp));
//			System.out.println(result.get(0));
		}else {
			System.out.println("조건에 맞는 데이터가 발견되지 않았습니다.");
			//필요한 처리 작업을 해준다.
		}
	}
	
	
}
