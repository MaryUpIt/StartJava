package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookShelfTest {
    public static void main(String[] args) {
        System.out.println("Это приложение книжная полка.");
        BookShelf bookShelf = new BookShelf();
        String key;
        printMenu();
        do {
            bookShelf.showAllBooks();
            key = processing(bookShelf);
        } while (!key.equalsIgnoreCase("QUIT"));
    }


    static private void printMenu() {
        System.out.println("Для того чтобы взаимодействовать с ней используйте ключевые слова:");
        System.out.println("\"SAVE\" - положить книгу на полку");
        System.out.println("\"FIND\" - найти книгу");
        System.out.println("\"DELL\" - взять или убрать книгу");
        System.out.println("\"FREE\" - вывести количнство свободных мест на полке");
        System.out.println("\"FULL\" - вывести количнство книг на полке");
        System.out.println("\"CLEAR\" - убрать все книги с полки");
        System.out.println("\"MENU\" - показать меню");
        System.out.println("\"QUIT\" - выйти");
    }

    static private String processing(BookShelf bookShelf) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите команду: ");
        String key = scanner.nextLine();
        switch (key.toUpperCase()) {
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
                    System.err.println("Год печати должен быть реальным!!!");
                }
            }
            case "FIND" -> {
                System.out.print("Введите название книги: ");
                String title = scanner.nextLine();
                bookShelf.findBook(title);
            }
            case "DELL" -> {
                System.out.print("Введите название книги: ");
                String title = scanner.nextLine();
                bookShelf.deleteBook(title);
            }
            case "FREE" -> System.out.println("Количество сободных мест на полке - " + bookShelf.getFree());
            case "FULL" -> System.out.println("Количество книг на полке - " + bookShelf.getCountBooks());
            case "CLEAR" -> bookShelf.clear();
            case "MENU" -> printMenu();
            case "QUIT" -> System.out.println("Полка закрыта.");
            default -> System.err.println("Такой команды нет, выберите другую");
        }
        return key;
    }


}

