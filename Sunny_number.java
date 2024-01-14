package number;

public class Sunny_number {

	public static void main(String[] args) {
		int n=8,n1=n+1,root=0;
		for(int i=1;i<=n1;i++) {
			if(i*i==n1) {
				root=1;
				break;
			}
		}
		if(root==1) {
			System.out.println(n+" is sunny number");
		}
		else {
			System.out.println(n+" is not a sunny number");
		}
		

	}

}
//sunny number