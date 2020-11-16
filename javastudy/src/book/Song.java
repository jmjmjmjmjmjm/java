package book;

import lombok.Data;



@Data
public class Song {
	String title;
	String artist;
	int year;
	String country;
	
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public Song() {
		// TODO Auto-generated constructor stub
	}
	
	
}


