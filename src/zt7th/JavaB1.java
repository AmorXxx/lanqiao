package zt7th;

public class JavaB1 {

	public static void main(String[] args) {
		int[] a = new int[100];
		a[0] = 1;
		for (int i = 1; i < 100; i++) {
			a[i] = a[i - 1] + i + 1;
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}
}
