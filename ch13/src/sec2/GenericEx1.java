package sec2;

public class GenericEx1 {
	public static void main(String[] args) {
		Generic<Car> a = new Generic<Car>();
		Car car = new Car();
		a.setProduct(car);
		a.getProduct().run();
		
		Generic<Tv> b = new Generic<Tv>();
		Tv tv = new Tv();
		b.setProduct(tv);
		b.getProduct().run();
	}
}
