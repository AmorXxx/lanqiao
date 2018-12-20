package zt7th;

public class JavaB3 {
	static int count;
	public static void main(String[] args) {
		for(double A = 1; A<=9; A++){
            for(double B = 1; B<=9; B++){
                if(A != B){
                    for(double C = 1; C<=9; C++){
                        if(A != C && B != C){
                            for(double D = 1; D<=9; D++){
                                if(A != D && B != D && C != D){
                                    for(double E = 1; E<=9; E++){
                                        if(A != E && B != E && C != E && D != E){
                                            for(double F = 1; F<=9; F++){
                                                if(A != F && B != F && C != F && D != F && E != F){
                                                    for(double G = 1; G<=9; G++){
                                                        if(A != G && B != G && C != G && D != G && E != G && F != G){
                                                            for(double H = 1; H<=9; H++){
                                                                if(A != H && B != H && C != H && D != H && E != H && F != H && G != H){
                                                                    for(double I = 1; I<=9; I++){
                                                                        if(A != I && B != I && C != I && D != I && E != I && F != I && G != I && H != I){
                                                                            if(A + B/C + (D*100 + E*10 + F)/(G*100 + H*10 + I) == 10){
                                                                                count ++;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
