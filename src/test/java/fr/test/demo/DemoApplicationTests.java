package fr.test.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.test.demo.controller.BookController;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private BookController bookController;

	@Test
	void contextLoads() {
		assertThat(bookController).isNotNull();
	}

	@Test
	public void main() {
		DemoApplication.main(new String[] {});
	}

}
