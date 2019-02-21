package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * [问题描述]
 * 
 * 
 * 
 * 考虑如下的序列生成算法：从整数 n 开始，如果 n 是偶数，把它除以 2；如果 n 是奇数，把它乘 3 加1。用新得到的值重复上述步骤，直到 n = 1
 * 时停止。例如，n = 22 时该算法生成的序列是：
 * 
 * 22，11，34，17，52，26，13，40，20，10，5，16，8，4，2，1
 * 
 * 
 * 
 * 人们猜想（没有得到证明）对于任意整数 n，该算法总能终止于 n = 1。这个猜想对于至少 1 000 000内的整数都是正确的。
 * 
 * 
 * 
 * 对于给定的 n，该序列的元素（包括 1）个数被称为 n 的循环节长度。在上述例子中，22 的循环节长度为 16。输入两个数 i 和 j，你的任务是计算 i
 * 到 j（包含 i 和 j）之间的整数中，循环节长度的最大值。
 * 
 * 
 * 
 * [输入]
 * 
 * 输入每行包含两个整数 i 和 j。所有整数大于 0，小于 1 000 000。
 * 
 * 
 * 
 * [输出]
 * 
 * 对于每对整数 i 和 j，按原来的顺序输出 i 和
 * j，然后输出二者之间的整数中的最大循环节长度。这三个整数应该用单个空格隔开，且在同一行输出。对于读入的每一组数据，在输出中应位于单独的一行。
 * 
 * 
 * 
 * [样例输入]
 * 
 * 1 10
 * 
 * 100 200
 * 
 * 201 210
 * 
 * 900 1000
 * 
 * 
 * 
 * [样例输出]
 * 
 * 1 10 20
 * 
 * 100 200 125
 * 
 * 201 210 89
 * 
 * 900 1000 174
 *
 */
public class ProblemOf3nPlus1 {
	static int count = 1;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			List<Integer> amount = new ArrayList<Integer>();
			int i = sc.nextInt();
			int j = sc.nextInt();
			if(i > j) {
				int temp = i;
				i = j;
				j = temp;
			}
			for (int a = i; a <= j; a++) {
				amount.add(count(a));
				count = 1;
			}
			Collections.sort(amount);
			int max = amount.get(amount.size() - 1);
			System.out.println(i + " " + j + " " + max);
		}
	}

	public static int count(long a) {
		while (a > 1) {
			a = (a % 2 == 0) ? (a / 2) : (a * 3 + 1);
			++count;
		}
		return count;
	}
}
