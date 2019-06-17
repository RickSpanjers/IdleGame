package idlegame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "repository")
@EntityScan("domain")
@ComponentScan("rest")
@ComponentScan("controllers")
@ComponentScan("repository")
@SpringBootApplication
public class IdleGameApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(IdleGameApplication.class, args);
	}

}
