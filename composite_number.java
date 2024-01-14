package number;

public class composite_number {

	public static void main(String[] args) {
		int n=4;
		int count=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				count++;
			}
		}
		System.out.println(count+"  the count of number");
		if(count>2) {
			System.out.println(n+" is composite number   ");
		}
		else
			System.out.println(n+" is not a composite number");

	}

}
//composite number: the count of factors is more then 2
