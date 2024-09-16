package com.Library;

public abstract class WrittenItem extends Item{
	public WrittenItem(int id, String title, int copies) {
		super(id, title, copies);
		// TODO Auto-generated constructor stub
	}

	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
