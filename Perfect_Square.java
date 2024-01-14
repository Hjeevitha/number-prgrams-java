package number;

public class Perfect_Square {

	public static void main(String[] args) {
		int n=36;int root=0;
		for(int i=1;i<10;i++) {
			if(i*i==n) {
				root=1;
				System.out.println(i+" * "+i+" == "+n);
				System.out.println(i+"  is a squareroot of "+n);
				System.out.println(n+ "  perfect number");
				break;
			}
			
		}
		if(root==0) {
			System.out.println(n+" not a perfect number");
		}

	}

}
