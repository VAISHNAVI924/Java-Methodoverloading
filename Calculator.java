package methodoverloading;

public class Calculator {
	void sum(int a,int b) {
		int res=a+b;
		System.out.println("result is"+res);
	}
void sum(int c,double d) {
	double res=c+d;
	System.out.println("result is"+res);
}
void sum(double a,double b) {
	double res=a+b;
	System.out.println("result is"+res);
}
}
