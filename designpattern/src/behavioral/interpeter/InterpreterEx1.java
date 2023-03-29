package behavioral.interpeter;
//Interpreter (해설자) : 주어진 언어에 대해, 그 언어의 문법을 위한 표현 수단을 정의하고, 이와 아울러 그 표현 수단을 사용하여 해당 언어로 작성된 문장을 해석할 수 있는 해설자를 정의하는 패턴
public class InterpreterEx1 {
   public static Expression getMaleExpression(){
      Expression robert = new TerminalExpression("Robert");
      Expression john = new TerminalExpression("John");
      return new OrExpression(robert, john);		
   }

   public static Expression getMarriedWomanExpression(){
      Expression julie = new TerminalExpression("Julie");
      Expression married = new TerminalExpression("Married");
      return new AndExpression(julie, married);		
   }
	public static void main(String[] args) {
	      Expression isMale = getMaleExpression();
	      Expression isMarriedWoman = getMarriedWomanExpression();

	      System.out.println("John is male? " + isMale.interpret("John"));
	      System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
	}
}
