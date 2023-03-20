package sec3;

public class StudentEx1 {

	public static void main(String[] args) {
		Student st0 = new Student();
		st0.setName("변백현");
		st0.setAge(17);
		st0.setPg(90);
		st0.setDb(80);
		st0.setUi(100);
		st0.setTot();	//총점
		st0.setAvg();	//평균
		System.out.println("이름 : "+st0.getName());
		System.out.println("총점 : "+st0.getTot());
		System.out.println("평균 : "+st0.getAvg());
		System.out.println("학점 : "+st0.getHak());
		
		Student st1 = new Student("이민형");
		st1.setAge(18);
		st1.setPg(90);
		st1.setDb(90);
		st1.setUi(90);
		System.out.println("나이 : "+st1.getAge());
		System.out.println("pg : "+st1.getPg());
		System.out.println("db : "+st1.getDb());
		System.out.println("ui : "+st1.getUi());
	}

}
