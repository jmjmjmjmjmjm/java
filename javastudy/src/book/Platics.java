package book;

public class Platics {
	public static void main(String[] args) {
		String a = new String("C#");
		String b = new String(",C++");
		
		System.out.println(a + "의 길이는"  + a.length()); //문자열 길이(개수)
		System.out.println(a.contains("#")); //문자열 포함관계 >> true
		
		a=a.concat(b); //문자열 연결 >> C#,C++
		
		a=a.trim(); //문자열 앞 뒤의 공백제거
		
		a= a.replace("C#","Java"); //문자열 대치 >> "Java,C++"
		
		String s[]=a.split(","); //문자열 분리 
		
		
		a=a.substring(5); //인덱스5부터 끝까지 서브스트링패턴 >>"C++"
		
		
		char c = a.charAt(2); //인덱스 2의 문자리턴 >> + 
		
	}

}
