package sec1;

public class Product {
	public int no;
	public String pname;
	
	public Product(){}
	
	public Product(int no){
		this.no = no;
	}
	public Product(int no, String pname){
		this.no = no;
		this.pname = pname;
	}

	@Override
	public int hashCode() {
		return super.hashCode() % 1000;
	}

	@Override
	public String toString() {
		return "no : "+this.no+", pname : "+this.pname;
	}

	//복제
	@Override
	protected Product clone() throws CloneNotSupportedException {
		return this.clone();
	}

	//객체 제거
	@Override
	protected void finalize() throws Throwable {
		System.out.println("요청하신 객체를 제거하였습니다.");
		this.finalize();
	}
}
