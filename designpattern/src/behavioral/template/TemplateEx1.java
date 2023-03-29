package behavioral.template;
//Template (판형-틀) : 객체의 연산에는 알고리즘의 뼈대만을 정의하고 각 단계에서 수행할 구체적 처리는 서브클래스 쪽으로 미루는 패턴
public class TemplateEx1 {
	public static void main(String[] args) {
      Game game = new Cricket();
      game.play();
      System.out.println();
      game = new Football();
      game.play();
	}
}
