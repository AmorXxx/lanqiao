package zt7th;
/**
 * 此类为该题标准答案。
 */
import java.util.HashSet;  

public class JavaB7_1{  
    public static int count = 0;    
    public static int [] a = new int[5];    
    public static HashSet<String> hashset = new HashSet<String>();  

    private static boolean check() {    
        // TODO Auto-generated method stub    
        boolean flag[] = new boolean[5];    
        dfs(flag,0);    
        return flag[0]&&flag[1]&&flag[2]&&flag[3]&&flag[4];    
    }    

    private static void dfs(boolean[] flag,int n) {    
        // TODO Auto-generated method stub    
        flag[n] = true;    
        for(int i = 0; i < 5; i++){    
            //加一减一要在同一行、加四减四要在同一列    
            if(!flag[i] && (a[i]/4 == a[n]/4) && (a[i] == a[n] - 1 || a[i] == a[n] + 1)){    
                dfs(flag,i);    
            }    
            if (!flag[i] && (a[i]%4 == a[n]%4) && (a[i] == a[n] - 4 || a[i] == a[n] + 4)){    
                dfs(flag,i);    
            }    
        }       
    }  

    public static void main(String[] args){    
        // TODO Auto-generated method stub    
        for(a[0] = 0; a[0] < 12; ++a[0]){  
            for(a[1] = a[0]+1; a[1] < 12; ++a[1]){  
                for(a[2] = a[1]+1; a[2] < 12; ++a[2]){    
                    for(a[3] = a[2]+1; a[3] < 12; ++a[3]){    
                        for(a[4] = a[3]+1; a[4] < 12; ++a[4]){    
                            if(check()){    
                                hashset.add(""+a[0]+a[1]+a[2]+a[3]+a[4]);    
                            }  
                        }  
                    }  
                }  
            }  
        }  
        System.out.println(hashset.size());    
    }  
}