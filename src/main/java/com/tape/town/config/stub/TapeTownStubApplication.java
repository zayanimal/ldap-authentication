package com.tape.town.config.stub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@SpringBootApplication(exclude = { HibernateJpaAutoConfiguration.class })
@Profile("stub")
@Import({ AppStubConfig.class })
public class TapeTownStubApplication {
	public static void main(String[] args) {
		SpringApplication.run(TapeTownStubApplication.class, args);
	}
}
