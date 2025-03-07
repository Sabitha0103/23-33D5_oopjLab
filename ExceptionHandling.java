import java.util.Scanner;
public class ExceptionHandling
{
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		int a=read.nextInt();
		int b=read.nextInt();
		try
		{
			int result=a/b;
			System.out.println("Division of two numbers:"+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("error:divisible by zero is not possible");
		}
	}
}