package structual.decorator;
//Decorator(장식자) : 주어진 상황에서 용도에 따라 어떤 객체에 책임을 덧붙이는 패턴
public class DecoratorEx1 {
	public static void main(String[] args) {
	    Shape circle = new Circle();

	    Shape redCircle = new RedShapeDecorator(new Circle());

	    Shape redRectangle = new RedShapeDecorator(new Rectangle());

	    System.out.println("< 일반적인 원 그리기 >");
	    circle.draw();
	    System.out.println("----------------------------");

	    System.out.println("< 빨간색 경계선 가진 원 그리기 >");
	    redCircle.draw();
	    System.out.println("----------------------------");

	    System.out.println("< 빨간색 경계선 가진 직사각형 그리기 >");
	    redRectangle.draw();
	}
}
