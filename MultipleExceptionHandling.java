import java.util.Arrays;
import java.util.Scanner;
public class MultipleExceptionHandling
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
			int[] arr={1,2,3,4};
			System.out.println("enter index:");
			int index=read.nextInt();
			System.out.println("array element:"+arr[index]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("error:divisible by zero is not possible");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("error:array index is out of bound");
		}
  		finally
		{
			System.out.println("execution completed");
		}
	}
}