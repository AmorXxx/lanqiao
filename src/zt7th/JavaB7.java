package zt7th;
/**
 * 此方法无法排除3+2形态的剪法
 * @author Amor
 *
 */
public class JavaB7 {
	static int count = 0;

	public static void main(String[] args) {
		
		for (int a = 1; a <= 12; a++) {
			for (int b = 1; b <= 12 && b != a; b++) {
				for (int c = 1; c <= 12 && c != b && c != a; c++) {
					for (int d = 1; d <= 12 && d != c && d != b && d != a; d++) {
						for (int e = 1; e <= 12 && e != d && e != c && e != b && e != a; e++) {
							check(a, b, c, d, e);
						}
					}
				}
			}
		}
	}

	public static void check(int a, int b, int c, int d, int e) {
		boolean[] check = new boolean[5];
		int i = 0;
		if (a == 1 || b == 1 || c == 1 || d == 1 || e == 1) {
			if (a == 2 || a == 5 || b == 2 || b == 5 || c == 2 || c == 5 || d == 2 || d == 5 || e == 2 || e == 5) {
				check[i] = true;
				i++;
			}
		}
		if (a == 2 || b == 2 || c == 2 || d == 2 || e == 2) {
			if (a == 1 || a == 3 || a == 6 || b == 1 || b == 3 || b == 6 || c == 1 || c == 3 || c == 6 || d == 1
					|| d == 3 || d == 6 || e == 1 || e == 3 || e == 6) {
				check[i] = true;
				i++;
			}
		}
		if (a == 3 || b == 3 || c == 3 || d == 3 || e == 3) {
			if (a == 2 || a == 4 || a == 7 || b == 2 || b == 4 || b == 7 || c == 2 || c == 4 || c == 7 || d == 2
					|| d == 4 || d == 7 || e == 2 || e == 4 || e == 7) {
				check[i] = true;
				i++;
			}
		}
		if (a == 4 || b == 4 || c == 4 || d == 4 || e == 4) {
			if (a == 3 || a == 8 || b == 3 || b == 8 || c == 3 || c == 8 || d == 3 || d == 8 || e == 3 || e == 8) {
				check[i] = true;
				i++;
			}
		}
		if (a == 5 || b == 5 || c == 5 || d == 5 || e == 5) {
			if (a == 1 || a == 6 || a == 9 || b == 1 || b == 6 || b == 9 || c == 1 || c == 6 || c == 9 || d == 1
					|| d == 6 || d == 9 || e == 1 || e == 6 || e == 9) {
				check[i] = true;
				i++;
			}
		}
		if (a == 6 || b == 6 || c == 6 || d == 6 || e == 6) {
			if (a == 2 || a == 5 || a == 7 || a == 10 || b == 2 || b == 5 || b == 7 || b == 10 || c == 2 || c == 5
					|| c == 7 || c == 10 || d == 2 || d == 5 || d == 7 || d == 10 || e == 2 || e == 5 || e == 7
					|| e == 10) {
				check[i] = true;
				i++;
			}
		}
		if (a == 7 || b == 7 || c == 7 || d == 7 || e == 7) {
			if (a == 3 || a == 6 || a == 8 || a == 11 || b == 3 || b == 6 || b == 8 || b == 11 || c == 3 || c == 6
					|| c == 8 || c == 11 || d == 3 || d == 6 || d == 8 || d == 11 || e == 3 || e == 6 || e == 8
					|| e == 11) {
				check[i] = true;
				i++;
			}
		}
		if (a == 8 || b == 8 || c == 8 || d == 8 || e == 8) {
			if (a == 4 || a == 7 || a == 12 || b == 4 || b == 7 || b == 12 || c == 4 || c == 7 || c == 12 || d == 4
					|| d == 7 || d == 12 || e == 4 || e == 7 || e == 12) {
				check[i] = true;
				i++;
			}
		}
		if (a == 9 || b == 9 || c == 9 || d == 9 || e == 9) {
			if (a == 5 || a == 10 || b == 5 || b == 10 || c == 5 || c == 10 || d == 5 || d == 10 || e == 5 || e == 10) {
				check[i] = true;
				i++;
			}
		}
		if (a == 10 || b == 10 || c == 10 || d == 10 || e == 10) {
			if (a == 6 || a == 9 || a == 11 || b == 6 || b == 9 || b == 11 || c == 6 || c == 9 || c == 11 || d == 6
					|| d == 9 || d == 11 || e == 6 || e == 9 || e == 11) {
				check[i] = true;
				i++;
			}
		}
		if (a == 11 || b == 11 || c == 11 || d == 11 || e == 11) {
			if (a == 10 || a == 7 || a == 12 || b == 10 || b == 7 || b == 12 || c == 10 || c == 7 || c == 12 || d == 10
					|| d == 7 || d == 12 || e == 10 || e == 7 || e == 12) {
				check[i] = true;
				i++;
			}
		}
		if (a == 12 || b == 12 || c == 12 || d == 12 || e == 12) {
			if (a == 8 || a == 11 || b == 8 || b == 11 || c == 8 || c == 11 || d == 8 || d == 11 || e == 8 || e == 11) {
				check[i] = true;
				i++;
			}
		}

		if (check[0] == true && check[1] == true && check[2] == true && check[3] == true && check[4] == true) {
			int[] yp = {a,b,c,d,e};
			for (int j : yp) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
