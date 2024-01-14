package number;

public class nth_fibonacci {

	public static void main(String[] args) {
//		psition should be less then range
		int position=7;
		int range=10;
		int n1=0,n2=1,n3=0;
		for(int i=1;i<=range;i++) {
			if(i==position) {
				System.out.println(n1);
			}
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
		}
	}

}
