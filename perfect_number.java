package number;

//perfect number=sum Of factors exclude the number given

public class perfect_number {

	public static void main(String[] args) {
			int n=28;
			int sum=0;
			for(int i=1;i<=n/2;i++) {
				if(n%i==0) {
					System.out.print(i+" ");
					sum=sum+i;
				}
			}
			System.out.println();
			System.out.println("sum of factors are : "+sum);
			if(n==sum) {
				System.out.println(n+" is perfect number");
			}
			else
				System.out.println(n+" is not a perfect number");
		}

}
