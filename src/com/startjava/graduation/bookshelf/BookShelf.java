package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class BookShelf {
    private int countBooks;
    private final static int VALUE_BOOK_SHELF = 10;
    static Book[] books = new Book[VALUE_BOOK_SHELF];
    int lineLength;

    public void saveBook(Book book) {
        try {
            books[countBooks++] = book;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Полка переполнена");
        }
    }

    public void findBook(String title) {
        int index = findIndexBook(title);
        if (index == -1) {
            System.out.println("Такой книги на полке нет");
        } else {
            System.out.println(getBooks()[index].toString());
        }
    }

    public void deleteBook(String title) {
        int delIndex = findIndexBook(title);
        if (delIndex == -1) {
            System.out.println("Такой книги на полке нет");
        } else {
            for (int i = delIndex; i < books.length - 1; i++) {
                if (books[i] == null) {
                    break;
                }
                books[i] = books[i + 1];

            }
            countBooks--;
        }
    }

    private int findIndexBook(String title) {
        for (int i = 0; i < getBooks().length; i++) {
            if (getBooks()[i].getTitle().equals(title)) {
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
        Arrays.fill(books, 0, countBooks, null );

    }

    private Book[] getBooks() {
        return Arrays.copyOf(books, countBooks);
    }

    public void showAllBooks() {
        if (isEmpty()) {
            System.out.println("На данный момент полка пуста, положите хотя бы одну книгу.");
        } else {
            printLine("-");
            for (Book book : books) {
                if (book != null) {
                    System.out.print("|" + book.toString());
                    for (int i = book.toString().length(); i < getLineLength(); i++) {
                        System.out.print(" ");
                    }
                    System.out.println("|");

                } else {
                    printLine(" ");
                }
                printLine("-");
            }
        }
    }

    private int getLineLength() {
        for (Book book : getBooks()) {
            int bookLength = book.toString().length();
            if (bookLength > lineLength) {
                lineLength = bookLength;
            }
        }
        return lineLength;
    }
    private void printLine(String symbol) {
        System.out.print("|");
        for (int i = 0; i < getLineLength(); i++) {
            System.out.print(symbol);
        }
        System.out.println("|");
    }
    private boolean isEmpty() {
        for (Book book : books) {
            if (book != null) {
                return false;
            }
        }
        return true;
    }
}
