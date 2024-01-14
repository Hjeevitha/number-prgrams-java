package number;

public class Number_starttEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9023;
		while(n>10) {
			n=n/10;
		}
		System.out.println(n);
		if(n%2==0) {
			System.out.println("number start with even");
		}
		System.out.println("number strat with odd");

		//		another method
		int an=2465;
		int rem=0;
		while(an>0) {
			rem=an%10;
			an=an/10;
		}
		System.out.println(rem);
		if(rem%2==0) 
			System.out.println("number start with even");		
		else
		System.out.println("number strat with odd");
	}
}
