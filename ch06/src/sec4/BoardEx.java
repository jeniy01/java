package sec4;

public class BoardEx {

	public static void main(String[] args) {
		//static field나 static method는 객체 생성 없이 사용할 것
		Board board1 = new Board();
		Board board2 = new Board();
		board1.title = "제목연습";
		board1.content = "내용연습";
		System.out.println(board1.title);
		System.out.println(board2.title);
		System.out.println(board1.con);	//static block에서 기술한 내용은 변하지 않음
		System.out.println(board2.allData);
		//board1.outputData();
		Board.outputData();
	}

}
