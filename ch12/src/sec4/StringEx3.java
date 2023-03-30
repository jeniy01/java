package sec4;
//토큰으로 나눌 때 사용, 이때 토큰은 구분기호를 뜻함
//java api 사이트 가서 확인해보기
import java.util.StringTokenizer;
public class StringEx3 {
	public static void main(String[] args) {
		String data = "나재민&이제노&이마크&이동혁&황인준";
		//StringTokenizer
		StringTokenizer st = new StringTokenizer(data, "&");
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println();
		
		//String 배열
		String[] arr = data.split("&");
		for(String token : arr){
			System.out.println(token);
		}
	}
}
