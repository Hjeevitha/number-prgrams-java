package number;

public class Even_InDigits {

	public static void main(String[] args) {
		for(int i=56789;i>0;) {
			int rem=i%10;
			if(rem%2==0) 
				System.out.println(rem);
			i=i/10;
		}
	}
}
