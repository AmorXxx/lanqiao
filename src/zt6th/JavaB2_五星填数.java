package zt6th;

public class JavaB2_ÎåĞÇÌîÊı {

	static int sum = 0;

	public static void main(String[] args) {
		int k[] = new int[11];
		a(0, k, 10);
		System.out.print(sum / 10);
	}

	static void a(int num, int k[], int n) {
		num++;
		for (int i = 1; i <= 12; i++) {
			if (!judge(i, num - 1, k))
				continue;
			k[num] = i;
			if (num == n) {
				int a = k[1] + k[3] + k[6] + k[9];
				int b = k[1] + k[4] + k[8] + k[10];
				int c = k[2] + k[3] + k[4] + k[5];
				int d = k[2] + k[6] + k[7] + k[10];
				int e = k[5] + k[8] + k[7] + k[9];
				if (a == b && a == c && a == d && a == e)
					sum++;
			} else
				a(num, k, n);
		}
	}

	static boolean judge(int a, int num, int k[]) {
		if (a == 7)
			return false;
		if (a == 11)
			return false;
		for (int i = 1; i <= num; i++) {
			if (a == k[i])
				return false;
		}
		return true;

	}
}
