package in.strikes.Lecture11_crudSpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Lecture11CrudSpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lecture11CrudSpringBootDemoApplication.class, args);
		System.out.println("Hello");
	}

}
