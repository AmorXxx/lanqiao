package exercise;

import java.util.Scanner;

/**
 * [��������]
 * 
 * X�������С����¥��ȫ��һ���ģ����Ұ�������ʽ���С���¥���ı��Ϊ1,2,3...
 * 
 * ������һ��ʱ������һ�����ڵ�¥���������źš�
 * 
 * ���磺��С���źſ��Ϊ6ʱ����ʼ�������£�
 * 
 * 
 * 
 * 1 2 3 4 5 6
 * 
 * 12 11 10 9 8 7
 * 
 * 13 14 15 .....
 * 
 * 
 * 
 * ���ǵ������ǣ���֪������¥��m��n����Ҫ�������֮�������ƶ����루����б�߷����ƶ���
 * 
 * ����Ϊ3������w m n���ո�ֿ�������1��10000��Χ��
 * 
 * Ҫ�����һ����������ʾm n ��¥������ƶ����롣
 * 
 * 
 * 
 * [��������]
 * 
 * 6 8 2
 * 
 * [�������]
 * 
 * 4
 * 
 * 
 * 
 * [��������]
 * 
 * 4 7 20
 * 
 * [�������]
 * 
 * 5
 *
 */
public class ShortestDistance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int w = sc.nextInt();
			int m = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(Math.abs(mhang(w, m, n) - nhang(w, m, n)) + Math.abs(mlie(w, m, n) - nlie(w, m, n)));
		}

	}

	public static int mhang(int w, int m, int n) {
		int mhang = m / w;
		if (m % w != 0) {
			++mhang;
		} else {
			mhang = m / w;
		}
		return mhang;
	}

	public static int nhang(int w, int m, int n) {
		int nhang = n / w;
		if (n % w != 0) {
			++nhang;
		} else {
			nhang = n / w;
		}
		return nhang;
	}

	public static int mlie(int w, int m, int n) {
		int mlie = m % w;
		if (m % w == 0) {
			mlie = w;
		} else {
			if (mhang(w, m, n) % 2 == 0) {
				mlie = w - m % w + 1;
			} else {
				mlie = m % w;
			}
		}
		return mlie;
	}

	public static int nlie(int w, int m, int n) {
		int nlie = n % w;
		if (n % w == 0) {
			nlie = w;
		} else {
			if (nhang(w, m, n) % 2 == 0) {
				nlie = w - m % w + 1;
			} else {
				nlie = m % w;
			}
		}
		return nlie;
	}
}
