import java.util.Scanner;

public class StudentInfo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 키는 : ");
		double height = sc.nextDouble();
		
		System.out.println("당신의 몸무게는 : ");
		double weight = sc.nextDouble();
		
		System.out.println("키와 몸무게 :" + height + "," + weight);
		
		System.out.println("당신의 키는 : ");
		height = sc.nextDouble();
		
		System.out.println("당신의 몸무게는 : ");
		weight = sc.nextDouble();
		
		sc.close();
	}
}
