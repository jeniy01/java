package structual.flyweight;
//Flyweight(경량급) : 크기가 작은 객체가 여러 개 있을 때, 공유를 통해 이들을 효율적으로 지원하는 패턴
public class FlyweightEx1 {
	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
	public static void main(String[] args) {
      for(int i=0; i < 20; ++i) {
          Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
          circle.setX(getRandomX());
          circle.setY(getRandomY());
          circle.setRadius(100);
          circle.draw();
       }
	}
	
   private static String getRandomColor() {
	      return colors[(int)(Math.random()*colors.length)];
   }
   private static int getRandomX() {
      return (int)(Math.random()*100 );
   }
   private static int getRandomY() {
      return (int)(Math.random()*100);
   }
}
