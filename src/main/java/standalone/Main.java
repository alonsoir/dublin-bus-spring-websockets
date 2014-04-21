package standalone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ComponentScan
@EnableAutoConfiguration
@ImportResource("classpath:httpgateway.xml")
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
