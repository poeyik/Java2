package project;

public class PrimeNumber {
	public static boolean prime(int n) {
		boolean t = true;
		if(n==1)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				t = false;
				break;
			}
		}
		return t;
	}
}
//소수 확인 함수