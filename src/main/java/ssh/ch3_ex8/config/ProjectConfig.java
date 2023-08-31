package ssh.ch3_ex8.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import ssh.ch3_ex8.entity.Parrot;
import ssh.ch3_ex8.entity.Person;

@Configuration
public class ProjectConfig {

	@Bean
	@Primary
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
	Person person(@Qualifier("parrot2") Parrot parrot) {
		var pe = new Person();
		pe.setName("영수");
		pe.setParrot(parrot);
		return pe;
	}
}
