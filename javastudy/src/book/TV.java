package book;

public class TV {
	
	static String brand;
	static int year;
	static int big;
	
	
	public TV(String brand1, int year1, int big1) {
		brand = brand1;
		year = year1;
		big = big1;
	}
	

	public void show() {
		System.out.println(brand +" 에서 만든 "+ year+ "년형 " + big + "인치 " + "TV");
	}
	
	public TV() {
		// TODO Auto-generated constructor stub
	}
	
}
