package number;

public class SwapNum {

	public static void main(String[] args) {
		int a=15;
		int b=20;
		System.out.println("the numbers before swap a="+a+ " b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("the numbers after swap a="+a+ " b="+b);
	}
}



//int a=15;
//int b=20;
//int t;
//System.out.println("the numbers before swap a="+a+ " b="+b);
//t=a;
//a=b;
//b=t;
//System.out.println("the numbers after swap a="+a+ " b="+b);