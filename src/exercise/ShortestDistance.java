package exercise;

import java.util.Scanner;

/**
 * [问题描述]
 * 
 * X星球居民小区的楼房全是一样的，并且按矩阵样式排列。其楼房的编号为1,2,3...
 * 
 * 当排满一行时，从下一行相邻的楼往反方向排号。
 * 
 * 比如：当小区排号宽度为6时，开始情形如下：
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
 * 我们的问题是：已知了两个楼号m和n，需要求出它们之间的最短移动距离（不能斜线方向移动）
 * 
 * 输入为3个整数w m n，空格分开，都在1到10000范围内
 * 
 * 要求输出一个整数，表示m n 两楼间最短移动距离。
 * 
 * 
 * 
 * [样例输入]
 * 
 * 6 8 2
 * 
 * [样例输出]
 * 
 * 4
 * 
 * 
 * 
 * [样例输入]
 * 
 * 4 7 20
 * 
 * [样例输出]
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
