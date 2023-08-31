package ssh.ch3_ex8.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Person {
	private String name;
	private Parrot parrot;
}
