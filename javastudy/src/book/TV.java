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
		System.out.println(brand +" ���� ���� "+ year+ "���� " + big + "��ġ " + "TV");
	}
	
	public TV() {
		// TODO Auto-generated constructor stub
	}
	
}
