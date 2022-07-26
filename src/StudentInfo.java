import java.util.Scanner;

public class StudentInfo {
	public static void main(String[] args) {	// 프로그램의 시작과 끝
		Scanner sc = new Scanner(System.in);
		// nextLine() --> Enter까지 다 읽는다.
		// nextInt() --> 숫자만 읽기 때문에 number + Enter를 하면 Enter는 다음 입력으로 들어간다 그렇기 때문에 Enter를 날리기 위해 nextLine()을 한번 넣어주자.
		
		System.out.println("학생 이름 : ");
		String name = sc.nextLine();
		
		System.out.println("학번 : ");
		String hakbun = sc.nextLine();
		
		System.out.println("주소 : ");
		String address = sc.nextLine();
		sc.close();
		
		System.out.println("이름 : "+name);
		System.out.println("학번 : "+hakbun);
		System.out.println("주소 : "+address);
	}
}
