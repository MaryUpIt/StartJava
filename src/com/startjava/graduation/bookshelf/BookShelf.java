package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class BookShelf {
    private int countBooks;
    private final static int VALUE_BOOK_SHELF = 10;
    private Book[] books;
    private int maxLineLength;

    public BookShelf() {
        this.books = new Book[VALUE_BOOK_SHELF];
    }

    public void saveBook(Book book) {
        if (countBooks == VALUE_BOOK_SHELF) {
            System.out.println("Полка переполнена");
        } else {
            books[countBooks++] = book;
        }
    }

    public Book findBook(String title) {
        int index = findIndexBook(title);
        if (index != -1) {
            return books[index];
        }
        System.out.println("Такой книги на полке нет");
        return null;
    }

    public void deleteBook(String title) {
        int index = findIndexBook(title);
        if (index == -1) {
            System.out.println("Такой книги на полке нет");
        } else {
            System.out.println("Книга удалена с полки: " + books[index]);
            System.arraycopy(books, index + 1, books, index, --countBooks - index);
            books[countBooks] = null;
        }
    }

    private int findIndexBook(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    public int getFree() {
        return VALUE_BOOK_SHELF - countBooks;
    }

    public int getCountBooks() {
        return countBooks;
    }

    public void clear() {
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, books.length);
    }

    public int getMaxLineLength() {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].bookLength() > maxLineLength) {
                maxLineLength = books[i].bookLength();
            }
        }
        return maxLineLength;
    }

    public void test() {
        books[0] = new Book("Вуди Аллен", "Кстати ни о чем", "2020");
        books[1] = new Book("Кип Торн", "Черные дыры и складки времени", "1994");
        books[2] = new Book("Дэвид Дойч", "Начало бесконечности", "2011");
        books[3] = new Book("Алексей Иванов", "Сердце Пармы", "2020");
        books[4] = new Book("Виктор Пелевин", "КГБТ+", "2022");
        countBooks = 5;
    }
}
