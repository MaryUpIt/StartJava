package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class BookShelf {
    private int countBooks;
    private final static int VALUE_BOOK_SHELF = 10;
    private Book[] books = new Book[VALUE_BOOK_SHELF];
    private int lineLength;

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
            return getBooks()[index];
        } else {
            throw new NullPointerException("Такой книги на полке нет");
        }
    }

    public void deleteBook(String title) {
        int index = findIndexBook(title);
        if (index == -1) {
            System.out.println("Такой книги на полке нет");
        } else {
            countBooks--;
            System.arraycopy(books, index + 1, books, index, countBooks - index);
            books[countBooks] = null;
        }
    }

    private int findIndexBook(String title) {
        Book[] copyBooks = Arrays.copyOf(books, countBooks);
        for (int i = 0; i < copyBooks.length; i++) {
            if (copyBooks[i].getTitle().equals(title)) {
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

    public int getLineLength() {
        for (Book book : books) {
            if (book != null) {
                int bookLength = book.toString().length();
                if (bookLength > lineLength) {
                    lineLength = bookLength;
                }
            }
        }
        return lineLength;
    }

    public boolean isEmpty() {
        for (Book book : books) {
            if (book != null) {
                return false;
            }
        }
        return true;
    }

    //    public void test() {
//        books[0] = new Book("Вуди Аллен", "Кстати ни о чем", "2020");
//        books[1] = new Book("Кип Торн", "Черные дыры и складки времени", "1994");
//        books[2] = new Book("Дэвид Дойч", "Начало бесконечности", "2011");
//        books[3] = new Book("Алексей Иванов", "Сердце Пармы", "2020");
//        books[4] = new Book("Виктор Пелевин", "КГБТ+", "2022");
//        countBooks = 5;
//    }
}
