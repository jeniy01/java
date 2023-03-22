package sec3;

public class Descendant extends Parent{
//public class Descendant extends Child { //Child 클래스는 final 클래스이므로 상속할 수 없다.
	private String root;	//시조 항목 추가

	public String getRoot() {
		return root;
	}

	public void setRoot(String root) {
		this.root = root;
	}
}
