package sec3;

public class Child extends Parent {
	private String job;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public void getPrint() {
		System.out.println("자식1");
	}
	//부모클래스에서 final로 지정된 메소드는 오버라이딩 할 수 없다.
}
