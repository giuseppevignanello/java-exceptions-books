package org.lessons.java.books;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int booksNumber = 0;
		
		Scanner sc = new Scanner(System.in);
		while(booksNumber == 0) {
		try {
			System.out.print("How many books do you want to add?");
			booksNumber = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			booksNumber = 0;
			System.out.println("Insert a number");
		}
		}
		

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

		FileWriter writer = null;
		try {

			writer = new FileWriter("./file.txt", true);

			for (int i = 0; i < books.length; i++) {

				writer.write(books[i].getTitle() + "\n");

			}
		} catch (IOException e) {

			System.err.println("Error updating file: " + e.getMessage());
		} finally {

			try {
				writer.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
		File readerFile = new File ("./file.txt");
		Scanner reader = null;
		
		try {
			reader = new Scanner(readerFile);
			 while(reader.hasNextLine()) {
				 String titleLine = reader.nextLine();
				 System.out.println(titleLine);
			 }
		} catch (Exception e) {
			System.out.println("Error reading file: " + e.getMessage());
		} finally {
			if(reader!= null) {
				reader.close();
			}
		}

	}
}
