package creational.abstractfactory;

public class AbstractFactoryEx1 {
	public static void main(String[] args){
		//Abstract Factory 패턴은 선택적으로 추상화 객체를 만드는 공장을 만드는 방법
		
		//추상화팩토리 객체 생성
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

		//추상화팩토리 객체를 활용하여 직사각형 만들기
		Shape shape1 = shapeFactory.getShape("RECTANGLE");
		shape1.draw();
		
		//추상화팩토리 객체를 활용하여 정사각형 만들기
		Shape shape2 = shapeFactory.getShape("SQUARE");
		shape2.draw();
		
		//추상화팩토리 객체 생성
		AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
		
		//추상화팩토리 객체를 활용하여 직사각형 만들기
		Shape shape3 = shapeFactory1.getShape("RoundedRECTANGLE");
		shape3.draw();
		
		//추상화팩토리 객체를 활용하여 정사각형 만들기
		Shape shape4 = shapeFactory1.getShape("RoundedSQUARE");
		shape4.draw();
	}
}
