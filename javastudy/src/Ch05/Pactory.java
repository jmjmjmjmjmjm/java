package Ch05;
//추상클래스

public abstract class Pactory {
	//protected = 자식만 찾을수있게
	protected abstract void 색칠();
	protected void 건조() {
		System.out.println("건조 완료.");
	}
	
	public void 가동() {
		색칠();
		건조();
	}
	
}
