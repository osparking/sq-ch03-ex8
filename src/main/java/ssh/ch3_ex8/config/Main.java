package ssh.ch3_ex8.config;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ssh.ch3_ex8.entity.Person;

public class Main {

	public static void main(String[] args) {
		var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var youngSoo = ctx.getBean(Person.class);
		var ps = new PrintStream(System.out, true, UTF_8);
		ps.println(youngSoo);
	}

}
