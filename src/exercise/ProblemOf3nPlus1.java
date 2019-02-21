package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * [��������]
 * 
 * 
 * 
 * �������µ����������㷨�������� n ��ʼ����� n ��ż������������ 2����� n �������������� 3 ��1�����µõ���ֵ�ظ��������裬ֱ�� n = 1
 * ʱֹͣ�����磬n = 22 ʱ���㷨���ɵ������ǣ�
 * 
 * 22��11��34��17��52��26��13��40��20��10��5��16��8��4��2��1
 * 
 * 
 * 
 * ���ǲ��루û�еõ�֤���������������� n�����㷨������ֹ�� n = 1���������������� 1 000 000�ڵ�����������ȷ�ġ�
 * 
 * 
 * 
 * ���ڸ����� n�������е�Ԫ�أ����� 1����������Ϊ n ��ѭ���ڳ��ȡ������������У�22 ��ѭ���ڳ���Ϊ 16������������ i �� j����������Ǽ��� i
 * �� j������ i �� j��֮��������У�ѭ���ڳ��ȵ����ֵ��
 * 
 * 
 * 
 * [����]
 * 
 * ����ÿ�а����������� i �� j�������������� 0��С�� 1 000 000��
 * 
 * 
 * 
 * [���]
 * 
 * ����ÿ������ i �� j����ԭ����˳����� i ��
 * j��Ȼ���������֮��������е����ѭ���ڳ��ȡ�����������Ӧ���õ����ո����������ͬһ����������ڶ����ÿһ�����ݣ��������Ӧλ�ڵ�����һ�С�
 * 
 * 
 * 
 * [��������]
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
 * [�������]
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
