package zt7th;
import java.util.Scanner;  

public class JavaB8 {  
    public static void main(String [] args){  
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();  
        int maxn = (int) Math.sqrt(n);  
        boolean flag = true;  
        for(int a = 0; a <= maxn && flag; ++a){  
            for(int b = a; b <= maxn && flag; ++b){  
                for(int c = b; c <= maxn && flag; ++c){  
                    int d = (int) Math.sqrt(n-a*a-b*b-c*c);  
                    if(n == a*a+b*b+c*c+d*d){  
                        System.out.println(a+" "+b+" "+c+" "+d);  
                        flag = false;  
                    }  
                }  
            }  
        }  
    }  
}  
