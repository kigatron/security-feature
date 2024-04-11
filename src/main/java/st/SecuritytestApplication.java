package st;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "st")
@EntityScan(basePackages = "st.entity")
@EnableJpaRepositories(basePackages ="st.repository")
public class SecuritytestApplication {

	public static void main(String[] args) {

		SpringApplication.run(SecuritytestApplication.class, args);
		System.out.println("spring security boot up!");
	}

}
