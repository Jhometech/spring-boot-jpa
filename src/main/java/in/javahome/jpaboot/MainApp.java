package in.javahome.jpaboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MainApp.class);
		
		Student s = new Student();
		s.setName("Prakash");
		
		StudentRepository repositry = context.getBean(StudentRepository.class);
		repositry.save(s);
		
	}
}
