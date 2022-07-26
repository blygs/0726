
public class CharDemo {
	public static void main(String[] args) {
//		char grade = 'B';
//		char ch = '\n';
//		// '\' ==> 이스케이프, 탈출 문자
//		// 탈출 문자가 붙어있으면 특수문자로 본다.
//		
//		System.out.println("grade = " + grade);
//		System.out.println("ch = " + ch);
//		ch = 'C';
//		System.out.println("ch = " + ch);
		
		System.out.printf("%c \n", 65);
		System.out.printf("%c \n", 65 + 1);
		System.out.printf("%c \n", '\n');
		System.out.printf("%c \n", 97);
		
		char ch = 'C';
		System.out.printf("%c \n", ch);
		System.out.printf("%c\n", ch + 1);
		System.out.printf("%c1", '\b');
		System.out.printf("%c", 'E');
		
		System.out.printf("%c", '\uCAFE');
	}
}
