package book;

public class Platics {
	public static void main(String[] args) {
		String a = new String("C#");
		String b = new String(",C++");
		
		System.out.println(a + "�� ���̴�"  + a.length()); //���ڿ� ����(����)
		System.out.println(a.contains("#")); //���ڿ� ���԰��� >> true
		
		a=a.concat(b); //���ڿ� ���� >> C#,C++
		
		a=a.trim(); //���ڿ� �� ���� ��������
		
		a= a.replace("C#","Java"); //���ڿ� ��ġ >> "Java,C++"
		
		String s[]=a.split(","); //���ڿ� �и� 
		
		
		a=a.substring(5); //�ε���5���� ������ ���꽺Ʈ������ >>"C++"
		
		
		char c = a.charAt(2); //�ε��� 2�� ���ڸ��� >> + 
		
	}

}