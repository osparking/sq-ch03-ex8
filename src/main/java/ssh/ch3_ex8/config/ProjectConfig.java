package ssh.ch3_ex8.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ssh.ch3_ex8.entity.Parrot;
import ssh.ch3_ex8.entity.Person;

@Configuration
public class ProjectConfig {

	@Bean
	Parrot parrot1() {
		var p = new Parrot();
		p.setName("루키");
		return p;
	}

	@Bean
	Parrot parrot2() {
		var p = new Parrot();
		p.setName("디럭");
		return p;
	}

	@Bean
	Person person(Parrot pa) {
		var pe = new Person();
		pe.setName("영수");
		pe.setParrot(pa);
		return pe;
	}
}
