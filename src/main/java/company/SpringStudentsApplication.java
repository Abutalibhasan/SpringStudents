package company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import company.beans.School;
import company.beans.Student;
import company.controller.BeanConfiguration;
import company.repository.StudentRepository;

@SpringBootApplication
public class SpringStudentsApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringStudentsApplication.class, args);
	}

/**
		
	@Autowired
	EmployeeRepository repo;
		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub

			ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
			Employee emp = appContext.getBean("employee", Employee.class);
			emp.setsFirstName("Eiman");	
			emp.setsLastName("Albasha");
			repo.save(emp);
			Employee emp1 = new Employee(200,"Ali","Omer");
			Department d = new Department(11,"Employees");
			emp1.setDepartment(d);
			repo.save(emp1);
			
			List<Employee> allEmp = repo.findAll();
			for(Employee e: allEmp) {
				System.out.println(e.toString());
			}
		
		System.out.println(emp.toString());
	}
	
**/

}
