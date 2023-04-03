package sec3;

public class Course {
	//모든 사람이 신청 가능(Worker, Person, Student, MiddleStudent, HighStudent)
	public static void regCourse1(Applicant<?> applicant){
		System.out.println(applicant.kind.getClass().getSimpleName()+"이 COurse1을 등록함");
	}
	//학생만 등록 가능(Student, MiddleStudent, HighStudent)
	public static void regCourse2(Applicant<? extends Student> applicant){
		System.out.println(applicant.kind.getClass().getSimpleName()+"이 Course2을 등록함");
	}
	//직장인 또는 Person만 가능(Worker, Person)
	public static void regCourse3(Applicant<? super Worker> applicant){
		System.out.println(applicant.kind.getClass().getSimpleName()+"이 Course3을 등록함");
	}
}
