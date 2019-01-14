package zt7th;

public class JavaB2_ÉúÈÕÀ¯Öò {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int sum = 0;
			for (int j = i; j <= 100; j++) {
				sum += j;
				if (sum == 236) {
					System.out.println(i);
				}
			}
		}

	}

}
