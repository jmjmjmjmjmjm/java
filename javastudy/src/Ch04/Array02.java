package Ch04;

class job{
	String name;
	
	public String getName() {
		return name;
	}
}

class Police extends job{
	String name= "����";
	 public Police() {
	
	}
	public Police(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
}

class Doctor extends job{
	String name="�ǻ�";
	
	public Doctor() {
	
	}

	public Doctor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}







public class Array02 {
	
	public static void main(String[] args) {
		job[] men =new job[2];
		
		men[0]=new Police();
		men[1]=new Doctor();
		
		System.out.println(men[0].getName());
		System.out.println(men[1].getName());
		
		
	}

}
