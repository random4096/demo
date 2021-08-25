package fr.test.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import fr.test.demo.controller.BookController;
import fr.test.demo.model.Book;

@WebMvcTest(BookController.class)
//@SpringBootTest
//@AutoConfigureMockMvc
public class BookControllerTests {
    
    @Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldReturnDefaultMessage() throws Exception {
        RequestBuilder builder = MockMvcRequestBuilders.get("/");

        this.mockMvc.perform(builder).andExpect(MockMvcResultMatchers.status().isOk());
	}
    
    @Test 
    void greeting() {
        
    }
}
