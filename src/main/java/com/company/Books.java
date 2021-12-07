package com.company;

import java.util.Arrays;

public class Books {
    private Book[] lib;

    public Books(Book[] lib) {
        this.lib = lib;
    }

    public Book[] getBook() {
        return lib;
    }

    public void setBook(Book[] book) {
        this.lib = book;
    }

    @Override
    public String toString() {
        return "Books{" +
                "lib=" + Arrays.toString(lib) +
                '}';
    }
}
