package com;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.model.Employee;
import com.repository.EmployeeRepository;

@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
class Junitprogram {
	@Autowired
	EmployeeRepository eRepo;

	@Test
	@Order(1)
	@Rollback(value=false)
	public void testReadAll() {
		List list=eRepo.findAll();
		assertThat(list).size().isGreaterThan(0);
		}
	
	@Test
	@Order(2)
	@Rollback(value=false)
	public void testCreate() {
		Employee e1=new Employee();
		e1.setId(1001);
		e1.setName("karthik");
		e1.setAge(25);
		e1.setDept("IT");
		eRepo.save(e1);
		assertThat(e1.getId()).isGreaterThan(0);
	}

}
