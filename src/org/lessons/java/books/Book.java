package org.lessons.java.books;

	public class Book {
		private String title; 
		private int pages;
		private String author; 
		private String publisher; 
		
		public Book (String title, int pages, String author, String publisher) throws Exception {
			setTitle(title); 
			setAuthor(author);
			setPages(pages);
			setPublisher(publisher);
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) throws Exception{
			if(title.isBlank()) {
				throw new Exception("Title can't be empty");
			}
			this.title = title;
		}

		public int getPages() {
			return pages;
		}

		public void setPages(int pages) throws Exception {
			if(pages <= 0) {
				throw new Exception("Pages can't be 0 or less");
			}
			this.pages = pages;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) throws Exception {
			if(author.isBlank()) {
				throw new Exception("Author can't be empty");
			}
			this.author = author;
		}

		public String getPublisher() {
			return publisher;
		}

		public void setPublisher(String publisher) throws Exception {
			if(publisher.isBlank()) {
				throw new Exception("Publisher can't be empty");
			}
			this.publisher = publisher;
		}
		
	}
