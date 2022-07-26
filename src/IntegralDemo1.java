
public class IntegralDemo1 {
	public static void main(String[] args) {
		byte a = 5;
		byte b = 9;
		byte sum = (byte)(a + b);
		// cannot convert int to byte ==> Java는 이항연산(+-/*)일때에는 무조건 Int가 된다.
		// 강제로 형변환을 시키던지, sum의 타입을 int로 하던지.
		
		long money = 10_000_000_000L;
	}
}
