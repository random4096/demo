package fr.test.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import fr.test.demo.model.Book;

public class BookTests {

    @Test
    void stringTest() {
        Book book = new Book();

        book.setId("test");
        book.setSavedDate("savedDate");
        book.setLendPersonName("lendPersonName");
        book.setLendDate("lendDate");

        assertThat(book.getId()).isEqualTo("test");
        assertThat(book.getSavedDate()).isEqualTo("savedDate");
        assertThat(book.getLendPersonName()).isEqualTo("lendPersonName");
        assertThat(book.getLendDate()).isEqualTo("lendDate");
        assertThat(true).isEqualTo(false);
    }

    @Test 
    void readOwnedTest() {
        Book book = new Book();

        book.setRead(true);
        book.setOwned(true);

        assertThat(book.getRead()).isEqualTo(true);
        assertThat(book.getOwned()).isEqualTo(true);
    }
}