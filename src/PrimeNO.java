import java.nio.charset.MalformedInputException;
import java.util.Scanner;

public class PrimeNO {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n");
		int temp=sc.nextInt();
		prime(temp);
	} 
public static void prime(int n)
{
	
	boolean isPrime=false;
	int count=2;
	int i=2;
	System.out.print("1 2");
	while(true)
	{
		for (int j = 2; j < i; j++) {
			if(i%j==0)
			{
				isPrime=false;
				break;
			}
			else
			{
				isPrime=true;
				
			}
		}
		if(isPrime==true)
		{
			count=count+1;
			System.out.print(" "+i);
		}
		i=i+1;
		if(count==n)
		{
			break;
		}
	}
	
}
}
