package book;

public class SongApp {

	public static void main(String[] args) {
		
		Song profile = new Song();
			
			profile.title ="Dancing Queen";
			profile.artist="ABBA";
			profile.country="������";
			profile.year=1978;
			
			System.out.println(profile.year+ "�� "+profile.country +"������ "+ profile.artist+"�� �θ� "+ profile.title );
	}

}
