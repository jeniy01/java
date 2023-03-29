package structual.decorator;

public class RedShapeDecorator extends ShapeDecorator {
  public RedShapeDecorator(Shape decoratedShape) {
    super(decoratedShape); // default 생성자 아님 -> super 필수
  }

  @Override
  public void draw() {
    decoratedShape.draw(); // 원래 기능: (≒ 기반스트림)
    setRedBorder(decoratedShape); // 새로운 기능
  }

  // 추가된 기능: 빨간 테두리
  private void setRedBorder(Shape decoratedShape) {
    System.out.println("빨간색 경계선 칠하기");
  }
}
