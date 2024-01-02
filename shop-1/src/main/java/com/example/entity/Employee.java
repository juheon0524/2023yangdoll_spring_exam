package com.example.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "employee")
@Table(name = "employees")
@SequenceGenerator(
		name ="empSeq",
		sequenceName = "EMPLOYEES_SEQ",
		initialValue = 300,
		allocationSize = 1
		)
@Getter @Setter @ToString
public class Employee {
	@Id
	@Column(name = "EMPLOYEE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO,
					generator = "empSeq"
			)
	private Integer employeeId;
	
	private String FIRST_NAME;
	private String LAST_NAME;
	private String EMAIL;
	private String PHONE_NUMBER;
	private Date HIRE_DATE;
	private String JOB_ID;
	private Integer SALARY;
	private String COMMISSION_PCT;
	private Integer MANAGER_ID;
	private Integer DEPARTMENT_ID;
}
