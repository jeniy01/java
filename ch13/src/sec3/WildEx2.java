package sec3;

public class WildEx2 {
	public static void main(String[] args) {
		//regCourse1(?) - 모든 클래스
		Course.regCourse1(new Applicant<Person>(new Person()));
		Course.regCourse1(new Applicant<Worker>(new Worker()));
		Course.regCourse1(new Applicant<Student>(new Student()));
		Course.regCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		Course.regCourse1(new Applicant<HighStudent>(new HighStudent()));
		
		//regCourse2(? extends Student) - Student를 포함한 자식 클래스
		//Course.regCourse2(new Applicant<Person>(new Person()));
		//Course.regCourse2(new Applicant<Worker>(new Worker()));
		Course.regCourse2(new Applicant<Student>(new Student()));
		Course.regCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		Course.regCourse2(new Applicant<HighStudent>(new HighStudent()));
		
		//regCourse3(? super Worker) - Worker를 포함한 조상 클래스
		Course.regCourse3(new Applicant<Person>(new Person()));
		Course.regCourse3(new Applicant<Worker>(new Worker()));
		//Course.regCourse3(new Applicant<Student>(new Student()));
		//Course.regCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
		//Course.regCourse3(new Applicant<HighStudent>(new HighStudent()));
		
	}
}
