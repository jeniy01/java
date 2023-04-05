package sec2;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx2 {
	public static void main(String[] args) {
		HashSet<Board> boardArr = new HashSet<>();
		for(int i=1;i<11;i++){	//1~10
			boardArr.add(new Board(i, "제목"+i, "내용"+i, "2023-04-05"));
		}
		//개별 요소의 접근1
		for(Board b : boardArr){
			System.out.println(b.toString());
		}
		System.out.println();
		//개별 요소의 접근2
		Iterator it = boardArr.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println();
		System.out.println(boardArr.toString());
		boardArr.clear();
		System.out.println("boardArr이 비어 있습니까? "+boardArr.isEmpty());
	}
}
