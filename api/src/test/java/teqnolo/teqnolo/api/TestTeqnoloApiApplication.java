package teqnolo.teqnolo.api;

import org.springframework.boot.SpringApplication;

public class TestTeqnoloApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(TeqnoloApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
