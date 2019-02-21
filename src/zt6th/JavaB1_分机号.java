package zt6th;

public class JavaB1_·Ö»úºÅ {
	static int sum = 0;

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				for (int k = 0; k < j; k++) {

					sum++;
				}
			}
		}
		System.out.println(sum);
	}

}
