package zt7th;

import java.util.Scanner;

public class JavaB9_ȡ���� {
	public static int[] value = new int[1000];
    public static int[] getN = new int[3];
    public static int[] init = new int[5];
    public static char[] result = {'-','0','0','+'};
     
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int i = 0;i < 3;i++)
            getN[i] = in.nextInt();
        for(int i = 0;i < 5;i++)
            init[i] = in.nextInt();
        int minN = Math.min(getN[0], Math.min(getN[1], getN[2]));
        if(minN % 2 == 1) //�˴�����ƽ�֣������Ǿ�Ϊ���������Ǿ�Ϊż�����⣬���ﴦ��ԭ�������Լ�����
            value[0] = 1;  //����ƽ��,������Ĭ�Ͼ�Ϊ������
        else
            value[0] = 2;  //����ƽ��,������Ĭ�Ͼ�Ϊż����
        for(int i = 1;i < minN;i++)
            value[i] = 2;  //0������1��2����ƽ�֣�3����ʤ
        for(int i = minN;i < 1000;i++) {
            int temp = 0;      //��ʼ������ǰi������ȡ�߱���
             
            for(int j = 0;j < 3;j++) {
                if(i - getN[j] < 0)
                    continue;
                if(i - getN[j] == 0 && getN[j] % 2 == 1)
                    temp = 3;
                if(value[i - getN[j]] == 0) {  //��ʾi - getN[j]������ȡʱ������
                    if(getN[j] % 2 == 0)
                        temp = 3;
                        //��ʱ���ս��Ϊ����ȡ�����Ϊż����,������tempȡ������������һ����ʱ
                        //���Ǳ�Ӯ��������������ƽ�ֽ��
                    else
                        temp = 2 > temp ? 2 : temp;
                }
                if(value[i - getN[j]] == 1) { //��ʾi - getN[j]������ȡʱ������ȡ���Ϊ������
                    if(getN[j] % 2 == 0)
                        temp = 1 > temp ? 1 : temp;  //�˴����Ƚ�ͬ��
                }
                if(value[i - getN[j]] == 2) {//��ʾi - getN[j]������ȡʱ,����ȡ���Ϊż����
                    if(getN[j] % 2 == 1)
                        temp = 3;     //����������֣���Ӯ���������Ƚ��ж�
                    else
                        temp = 2 > temp ? 2 : temp;   //�˴��Ƚ�ͬ�ϣ��ų��������
                }
                if(value[i - getN[j]] == 3) {//��ʾi - getN[j]������ȡʱ,��Ӯ
                    if(getN[j] % 2 == 1)
                        temp = 1 > temp ? 1 : temp;
                }
            }
             
            value[i] = temp;  //��ǰi������ȡ��������Ӯ���
        }
        //��ӡ�������ս��
        for(int i = 0;i < 5;i++)
            System.out.print(result[value[init[i]]]+" ");
    }
}