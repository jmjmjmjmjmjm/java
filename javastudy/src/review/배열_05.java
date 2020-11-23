package review;



public class 배열_05 {
	
	public static void main(String[] args) {
		//배열 : 연속된 데이터공간을 확보해주기 때문에 엑세스가 굉장히 빠름.
		//단점 : 배열은 데이터 추가,삭제가 안됨.
		//특징 : 같은 타입의 여러데이터를 저장하는 자료형
		//Object 타입으로 만들면 모든 타입이 가능.
		//상속을 통해서 부모타입으로 묶으면 모든 타입이 다 가능.
		
		//배열은 크기가 정해져 있어야함.
		//컬렉션을 사용할 예정 ( ArrayList) - 제네릭을 알아야 사용.
		
		int[] n1 = new int[3];
		n1[0]=1;
		n1[1]=2;
		n1[2]=3;
		System.out.println(n1[2]);
		
		//Wrapper 클래스
		Object[] n2 = new Object[3];
		n2[0]='가';
		n2[1]=10;
		n2[2]=10.5;
		
	}

}
