
public class StudentInfo2 {
	public static void main(String[] args) {
		Student chulsu = new Student();	// 주소를 저장, 참조타입, new ==> 객체를 메모리에 할당 -> 인스턴스화, 따라서 chulsu는 인스턴스
		chulsu.name = "김철수";
		chulsu.student_number = "MZ002";
		chulsu.kor = 80;
		chulsu.eng = 100;
		chulsu.mat = 85;
		int total = chulsu.kor+chulsu.eng+chulsu.mat;
		double avg = total/3.0
				;
		System.out.printf("총점 : %d\n",total);
		System.out.println("평균 : "+avg);
		System.out.printf("평균 : %f\n",avg);
	}
}

// 하나의 java 파일 안에는 여러개의 class 를 생성할 수 있으나 그중에 단 하나만이 public class 이다.
class Student{		// 객체 - 모델링의 대상
	String name;	// 멤버 , Field
	String student_number;
	int kor;	// 값을 저장, 기본형
	int eng;
	int mat;
}