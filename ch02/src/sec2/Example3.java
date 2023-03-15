package sec2;

public class Example3 {
	public static void main(String[] args) {
		//형변환의 예1
		int kor = 80;
		int eng = 70;
		int mat = 95;
		int tot = kor + eng + mat;
		float avg = tot / 3.0f;
		//float avg = (float) tot / 3;
		//float avg = ((float) tot) / 3;
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+mat);
		System.out.println("총점 : "+tot);
		System.out.println("평균 : "+avg);
		
	}

}
