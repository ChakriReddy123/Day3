package com.Library;

public class Video extends MediaItem{

	private String director;
	private String genre;
	private int year;
	public Video(int id, String title, int copies,int runtime,String director,String genre,int year) {
		super(id, title, copies,runtime);
		this.director=director;
		this.genre=genre;
		this.year=year;
	}
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void print() {
		System.out.println("Video id  : "+this.getId()+" Title :"+this.getTitle()+" No of Copies : "+this.getCopies()
							+" Runtime :"+this.getRuntime()+" Director : "+this.director+" Genre : "+this.genre
							+ " Year : "+this.year
							);
	}
}
