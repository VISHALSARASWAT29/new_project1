package sumOfDigits;

public class Sum {
	
	public static void main(String args[])
	
	{
		System.out.println("Sum of Digits ===> " +sumOfDigits(20));
	}
		 public static int sumOfDigits(int n)
		    {
		        // add your code here
		        if(n==0){
		        return 0;}
		        else{
		        return (n%10 + sumOfDigits(n/10));
		        }
	}

}
