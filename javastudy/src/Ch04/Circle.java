package Ch04;

public class Circle {

	int radius;
	String name;
	
	public Circle() {
		radius =1;
		name="";
	}
	
	public Circle(int r,String n) {
		radius =r;
		name=n;
	}
	
	public double getarea() {
		return 3.14*radius*radius;
	}
	
	
	public static void main(String[] args) {
		Circle pizza = new Circle(10,"�ڹ�����");
		
		double area = pizza.getarea();
		System.out.println(pizza.name + "�� ������" + area);
		
		Circle donut =new Circle();
		donut.name ="��������";
		area = donut.getarea();
		System.out.println(donut.name + "�� ������"+ area);

	}

}
