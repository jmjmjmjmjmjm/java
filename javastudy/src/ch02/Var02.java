package ch02;

public class Var02 {
	public static void main(String[] args) {
		//code부분
		int num = 10; //4Byte = 32bit (-20억 ~ +20억)
		long num2 = 100; //8Byte 
		
		char s = '가'; //2Byte 
		
		double d = 7.5; //8Byte (-20억 ~ +20억)
		boolean b = true; //1Bit
		
		num = (int)d; // 7로됨 (다운 캐스팅 - 자료 유실)
		
		num = (int)num2; //명시적 형변환 (다운 캐스팅)
		num2 = num; //묵시적 형변환 (업 캐스팅)
	}//end

}
