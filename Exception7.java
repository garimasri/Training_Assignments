import java.util.Scanner;
class Exception7
{
	public static void main(String[] arg)
	{
		try
		{
			fun();
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("number is not feasible");
		}
	}
	static void fun()
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a<0)
		{
			throw new IllegalArgumentException();
		}
	}
		catch(IllegalArgumentException e)
	{
		throw e;
	}
	}

}