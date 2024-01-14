package number;
//the sum of the digits is raised of number
public class ArmStrong {

	public static void main(String[] args) {
		int n=153;
		int n1=n,temp=n1;
//		1..find the count
		int count=0;
		while(n>0) {
			int rem=n%10;
			count++;
			n=n/10;
		}
//		2. find power
		int sum=0;
		while(n1>0) {
			int rem=n1%10;
			int power=1;
			for(int i=1;i<=count;i++) {
				power=power*rem;
			}
			sum=sum+power;
			n1=n1/10;
		}
		if(temp==sum) {
			System.out.println(temp+" is armstrong number");
		}
		else {
			System.out.println(temp+"  is not a armstrong number");
		}
		
		
	}

}


