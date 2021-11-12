package week1.day1.assignment1;

public class FibonacciSerious {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int n1 = 0, n2 = 1, sum;
		System.out.print(n1);
		System.out.print(n2);
		for (int i = 2; i < n; i++) {
			sum = n1 + n2;
			System.out.print(sum);	
                  n1=n2;
                 n2=sum;		
			
		}

	}

}
