package com.Library;

public class Main {

	public static void main(String[] args) {
		Book b=new Book(1,"Chakri Book",2,"Chakri");
		Book b1=new Book(2,"Pavan Book",3,"Pavan");
		JournalPaper jp=new JournalPaper(33,"Hemanth Journal",5,"Hemanth");
		Video v1=new Video(5, "Baahubali",6,3,"Rajamouli","History",2015);
		CD cd1=new CD(23, "Kalki",4,3, "History", "Prabhas");
		
		b.print();
		b.checkout();
		v1.print();
		v1.checkout();
		v1.print();
		cd1.print();
		cd1.checkout();
		cd1.print();
		cd1.checkin();
		cd1.print();
		b.print();
		b.checkin();
		b.print();
	}

}
