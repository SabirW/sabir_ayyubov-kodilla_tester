package com.kodilla.rest.service;

import com.kodilla.rest.domain.BookDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private final List<BookDto> books = new ArrayList<>();

    public List<BookDto> getBooks() {
        return books;
    }

    public void addBook(BookDto book) {
        books.add(book);
    }

    public boolean removeBook(String title) {
        return books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }
}
