package kr.co.ezenac.constructor02;

public class StudentTest {

	public static void main(String[] args) {
		//기본생성자 호출
		Student student = new Student();
//		System.out.println(student.getAge());
		System.out.println(student.toString());

		System.out.println();
		//매개변수가 있는 생성자 호출
		Student student2 = new Student("이순신", 30);
		System.out.println(student2);
		
		//String만 있는 생성자
		Student studnet3 = new Student("이순신");
		System.out.println(studnet3);
		
	}

}
