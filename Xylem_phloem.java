package number;

public class Xylem_phloem {

	public static void main(String[] args) {
		int n=1234;
		int last=n%10;
		int osum=0,isum=0;
		
		while(n>=10) {
			int rem=n%10;
			isum=isum+rem;
			n=n/10;
		}
		osum=last+n;
		if(osum==isum) {
			System.out.println("xylem number");
		}
		else {
			System.out.println("phloem number");
		}	
	}
}
