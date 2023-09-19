package org.lessons.java.books;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many books do you want to add?");
		int booksNumber = Integer.parseInt(sc.nextLine());

		Book[] books = new Book[booksNumber];

		for (int i = 0; i < booksNumber; i++) {

			boolean validData = false;
			Book book = null;

			while (!validData) {
				try {
					System.out.println("Title: ");
					String title = sc.nextLine();
					System.out.println("Pages: ");
					int pages = Integer.parseInt(sc.nextLine());
					System.out.println("Author: ");
					String author = sc.nextLine();
					System.out.println("Publisher: ");
					String publisher = sc.nextLine();
					book = new Book(title, pages, author, publisher);
					validData = true;
				} catch (Exception e) {
					System.out.println("Invalid Data: " + e.getMessage());
				}
			}
			books[i] = book;
		}

		sc.close();
		System.out.println("Books: ");
		for (int i = 0; i < books.length; i++) {
			System.out.println("- " + books[i].getTitle());
		}
	}
}
