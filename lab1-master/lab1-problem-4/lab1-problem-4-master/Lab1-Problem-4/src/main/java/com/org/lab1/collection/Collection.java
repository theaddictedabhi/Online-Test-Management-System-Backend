package com.org.lab1.collection;

import java.util.ArrayList;
import java.util.List;
import com.org.lab1.employee.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Collection {

	private List<Employee> empList= new ArrayList<Employee>();
	
	@Bean
	public List<Employee> getEmpList()
	{
		empList.add(new Employee(101, "Ritik",790000.0));
		empList.add(new Employee(102,"deepu",85000.0));
		empList.add(new Employee(103,"deepika", 10000.0));
		empList.add(new Employee(104,"kamlesh",45000.0));
		
		return empList;
	}
}
