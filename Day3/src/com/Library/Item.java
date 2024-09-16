package com.Library;

public abstract class Item {
	private int id;
	private String title;
	private int copies;
	public Item(int id, String title, int copies) {
		super();
		this.id = id;
		this.title = title;
		this.copies = copies;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", copies=" + copies + "]";
	}
	public void print() {
		System.out.println(this.toString());
	}
	public  void checkin() {
		this.copies++;
		System.out.println("Checked in and the new count is "+ this.copies);
	}
	public  void checkout() {
		this.copies--;
		System.out.println("Checked out and the new count is "+ this.copies);
	}
	

}
