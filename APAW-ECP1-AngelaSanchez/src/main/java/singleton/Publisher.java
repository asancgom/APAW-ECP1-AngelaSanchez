package singleton;

import java.util.Calendar;

public class Publisher {
	private int id;
	private String title;
	private String city;
	private Calendar date; 
	private Author author;
	
	private static final Publisher oPublisher = new Publisher();
	
	private Publisher() {
		this.id = 0;
		this.title = "";
		this.city = "";
		this.date = Calendar.getInstance();
		this.author = new Author();
	}
	
	public static Publisher getPublisher() {
		return oPublisher;
	}
	
}
