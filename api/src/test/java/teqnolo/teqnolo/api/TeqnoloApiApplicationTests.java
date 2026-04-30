package teqnolo.teqnolo.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest(classes = TeqnoloApiApplication.class)
class TeqnoloApiApplicationTests {

	@Test
	void contextLoads() {
	}

}
