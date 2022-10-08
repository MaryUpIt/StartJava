package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookShelfTest {
    public static void main(String[] args) {
        System.out.println("Это приложение книжная полка.");
        BookShelf bookShelf = new BookShelf();
        String command;
        printMenu();
        do {
            showAllBooks(bookShelf);
            command = analyzeCommand(bookShelf);
        } while (!command.equalsIgnoreCase("QUIT"));
    }

    private static void showAllBooks(BookShelf bookShelf) {
        System.out.println("-".repeat(70));
        if (bookShelf.isEmpty()) {
            System.out.println("На данный момент полка пуста, положите хотя бы одну книгу.");
        } else {
            Book[] books = bookShelf.getBooks();
            int lineLength = bookShelf.getLineLength();
            System.out.println("|" + "-".repeat(lineLength) + "|");
            for (Book book : books) {
                if (book != null) {
                    System.out.print("|" + book.toString());
                    System.out.println(" ".repeat(lineLength - book.toString().length()) + "|");
                } else {
                    System.out.println("|" + " ".repeat(lineLength) + "|");
                }
                System.out.println("|" + "-".repeat(lineLength) + "|");
            }
        }
        System.out.println("_".repeat(70));
    }

    private static void printMenu() {
        System.out.println("-".repeat(70));
        String menu = """
                Для взаимодействия с приложением используйте КОМАНДЫ:
                "SAVE" - положить книгу на полку
                "FIND" - найти книгу
                "DEL" - взять или убрать книгу
                "FREE" - вывести количнство свободных мест на полке
                "FULL" - вывести количнство книг на полке
                "CLEAR" - убрать все книги с полки
                "MENU" - показать меню
                "QUIT" - выйти
                """;
        System.out.println(menu);
    }

    static private String analyzeCommand(BookShelf bookShelf) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите команду: ");
        String command = scanner.nextLine();
        switch (command.toUpperCase()) {
            case "SAVE" -> {
                System.out.print("Введите автора книги: ");
                String author = scanner.nextLine();
                System.out.print("Введите название книги: ");
                String title = scanner.nextLine();
                System.out.print("Введите год издания книги: ");
                String publishYear = scanner.nextLine();
                try {
                    bookShelf.saveBook(new Book(author, title, publishYear));
                } catch (NumberFormatException e) {
                    System.err.println("Год печати должен быть чилом!!!");
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getMessage());
                }
            }
            case "FIND" -> {
                System.out.print("Введите название книги: ");
                String title = scanner.nextLine();
                try {
                    System.out.println(bookShelf.findBook(title).toString());
                } catch (NullPointerException e) {
                    System.out.println(e.getMessage());
                }
            }
            case "DEL" -> {
                System.out.print("Введите название книги: ");
                String title = scanner.nextLine();
                bookShelf.deleteBook(title);
            }
            case "FREE" -> System.out.println("Количество сободных мест на полке - " + bookShelf.getFree());
            case "FULL" -> System.out.println("Количество книг на полке - " + bookShelf.getCountBooks());
            case "CLEAR" -> bookShelf.clear();
            case "MENU" -> printMenu();
//            case "TEST" -> bookShelf.test();
            case "QUIT" -> System.out.println("Полка закрыта.");
            default -> System.err.println("Такой команды нет, выберите другую");
        }
        return command;
    }
}

