package behavioral.visitor;
//Visitor (방문자) : 객체 구조를 이루는 원소에 대해 수행할 연산을 표현하는 패턴
public class VisitorEx1 {
	public static void main(String[] args) {
      ComputerPart computer = new Computer();
      computer.accept(new ComputerPartDisplayVisitor());
	}
}