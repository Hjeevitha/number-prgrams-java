package number;

public class count_digit {

	public static void main(String[] args) {
		int n=5678;
		int count=0;
		do{
			int rem=n%10;
			count++;
			n=n/10;		
		}while(n!=0) ;
		System.out.println("count of numbers present in given number "+count);
	}

}


