/*
 * 1. Student Class를 이용하여 다음과 같이 입력을 받은 학생 정보를 출력하시오.
 * 학번 : 2022-005
 * 이름 : 박지민
 * 국어 : 90
 * 영어 : 100
 * 수학 : 85
 * 총점 : 
 * 평균 : 평균은 소수점 2째자리까지 반올림/반내림해서 출력할 것
 * 
 * 2. 영문자 한개를 입력하면 해당 ASC|| 코드값을 출력하는 프로그램을 작성하시오.
 * <입력>
 * 문자 : A
 * <출력>
 * 문자 A의 코드값은 65입니다.
*/

import java.util.Scanner;
public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1.
		Student st = new Student();
		System.out.print("학번을 입력해 주세요. : ");
		st.student_number = sc.nextLine();
		
		System.out.print("이름을 입력해 주세요. : ");
		st.name = sc.nextLine();
		
		System.out.print("국어 점수를 입력해 주세요. : ");
		st.kor = sc.nextInt();
		sc.nextLine();
		
		System.out.print("영어 점수를 입력해 주세요. : ");
		st.eng = sc.nextInt();
		sc.nextLine();
		
		System.out.print("수학 점수를 입력해 주세요. : ");
		st.mat = sc.nextInt();
		sc.nextLine();
		
		
		int total = st.kor + st.eng + st.mat;
		double avg = total / 3.0;
		
		System.out.println("학번 : " + st.student_number);
		System.out.println("이름 : " + st.name);
		System.out.println("국어 : " + st.kor);
		System.out.println("영어 : " + st.eng);
		System.out.println("수학 : " + st.mat);
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f \n",avg);
		
		
		// 2.
		System.out.print("영문자 하나를 입력해 주세요. : ");
		char c = sc.nextLine().charAt(0);
//		System.out.println("문자 A의 코드값은 "+Character.getNumericValue(c)+"입니다."); // Unicode
		System.out.printf("문자 %c의 코드값은 %d입니다.", c, (int)c);	// ASC||
		
		sc.close();
		
	}
}