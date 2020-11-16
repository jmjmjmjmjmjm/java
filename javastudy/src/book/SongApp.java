package book;

public class SongApp {

	public static void main(String[] args) {
		
		Song profile = new Song();
			
			profile.title ="Dancing Queen";
			profile.artist="ABBA";
			profile.country="스웨인";
			profile.year=1978;
			
			System.out.println(profile.year+ "년 "+profile.country +"국적의 "+ profile.artist+"가 부른 "+ profile.title );
	}

}
