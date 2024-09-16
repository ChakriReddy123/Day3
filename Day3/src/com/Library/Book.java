package com.Library;

public class Book extends WrittenItem{

	public Book(int id, String title, int copies,String author) {
		super(id, title, copies);
		super.setAuthor(author);
	}
	public void print() {
		System.out.println("Book id  : "+this.getId()+" Title :"+this.getTitle()+" No of Copies : "+this.getCopies()
							+" Author :"+this.getAuthor()
							);
	}

	
}
