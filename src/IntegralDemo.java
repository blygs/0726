
public class IntegralDemo {
	public static void main(String[] args) {
		System.out.printf("255의 10진수 : %d\n", 255);
		System.out.printf("255의 2진수 : %s\n", Integer.toBinaryString(255));
		System.out.printf("255의 8진수 : %o%n", 255);
		System.out.printf("255의 16진수 : %x\n", 255);
		
		System.out.println("********************************************");
		System.out.printf("0b01110000 의 10진수 : %d\n", 0b01110000);
		System.out.printf("0b01110000 의 2진수 : %s\n", Integer.toBinaryString(0b01110000));
		System.out.printf("0b01110000 의 8진수 : %o%n", 0b01110000);
		System.out.printf("0b01110000 의 16진수 : %x\n", 0b01110000);
		
		System.out.println("********************************************");
		System.out.printf("056 의 10진수 : %d\n", 056);
		System.out.printf("056 의 2진수 : %s\n", Integer.toBinaryString(056));
		System.out.printf("056 의 8진수 : %o%n", 056);
		System.out.printf("056 의 16진수 : %x\n", 056);
		
		System.out.println("********************************************");
		System.out.printf("0xab 의 10진수 : %d\n", 0xab);
		System.out.printf("0xab 의 2진수 : %s\n", Integer.toBinaryString(0xab));
		System.out.printf("0xab 의 8진수 : %o%n", 0xab);
		System.out.printf("0xab 의 16진수 : %x\n", 0xab);
		
		
		// \n == %n
	}
}
