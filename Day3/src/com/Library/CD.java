package com.Library;

public class CD extends MediaItem{
	private String artist;
	private String genre;
	public CD(int id, String title, int copies,int runtime, String genre, String artist) {
		super(id, title, copies,runtime);
		this.artist=artist;
		this.genre=genre;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void print() {
		System.out.println("CD id  : "+this.getId()+" Title :"+this.getTitle()+" No of Copies : "+this.getCopies()
							+" Runtime :"+this.getRuntime()+" Artist : "+this.artist+" Genre : "+this.genre
							);
	}

}
