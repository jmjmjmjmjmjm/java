package conn;

public class Test1 {

	public static void main(String[] args) {
		String download = "<p class=\"info_temperature\"><span class=\"todaytemp\">10</span>";
		int start = download.indexOf("10");
		System.out.println(start);
		
		
		String data = download.substring(52);
		String s[]=data.split("<");
		System.out.println("���ÿµ� : "+s[0]);
	}	

}