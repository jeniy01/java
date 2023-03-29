package structual.bridge;

public class BridgeEx1 {
	//Bridge(브릿지) : 구현부에서 추상층을 분리하여 각자 독립적으로 변형할 수 있게 하는 패턴
	public static void main(String[] args) {
      Shape redCircle = new Circle(100,100, 10, new RedCircle());
      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

      redCircle.draw();
      greenCircle.draw();
	}
}