package com.example.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
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
@Getter @Setter @ToString @Builder @NoArgsConstructor @AllArgsConstructor
public class Employee {
	@Id
	@Column(name = "EMPLOYEE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO,
					generator = "empSeq"
			)
	private Integer employeeId;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private Date hireDate;
	private String jobId;
	private Integer salary;
	private String commissionPct;
	private Integer managerId;
	private Integer departmentId;

	
}
