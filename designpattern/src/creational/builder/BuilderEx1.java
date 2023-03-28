package creational.builder;

public class BuilderEx1 {
	public static void main(String[] args) {
		//Builder Pattern : 
		//복합 객체의 생성 과정과 표현 방법을 분리하여 동일한 생성 절차에서 서로 다른 표현 결과를 만들 수 있게 하는 패턴
	    MealBuilder mealBuilder = new MealBuilder();
	
	    Meal vegMeal = mealBuilder.prepareVegMeal();
	    System.out.println("Veg Meal");
	    vegMeal.showItems();
	    System.out.println("Total Cost: " + vegMeal.getCost());
	
	    Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
	    System.out.println("\n\nNon-Veg Meal");
	    nonVegMeal.showItems();
	    System.out.println("Total Cost: " + nonVegMeal.getCost());
	}
}
