package number;

import java.util.Scanner;

public class table_two {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int fact=1;
		int i=1;
		while(i<=num) {
			fact=fact*i;
			i++;
		}
		System.out.println("factorial of "+num+" is "+fact);
	}

}
