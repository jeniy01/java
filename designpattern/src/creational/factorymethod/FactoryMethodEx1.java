package creational.factorymethod;

public class FactoryMethodEx1 {
	//객체를 생성하는 인터페이스는 미리 정의하되, 인스턴스를 만들 클래스의 결정은 서브클래스 쪽에서 내리는 패턴으로
	//특정 메소드를 호출하여 선택적으로 인스턴스(객체)를 만들기 위한 패턴
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
	}
}
