package behavioral.state;
//State (상태) : 객체의 내부 상태에 따라 스스로 행동을 변경할 수 있도록 허가하는 패턴
public class StateEx1 {
	public static void main(String[] args) {
      Context context = new Context();

      StartState startState = new StartState();
      startState.doAction(context);

      System.out.println(context.getState().toString());

      StopState stopState = new StopState();
      stopState.doAction(context);

      System.out.println(context.getState().toString());
	}
}
