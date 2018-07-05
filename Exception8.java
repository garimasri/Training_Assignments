import java.util.Scanner;
class Exception8
{
	public static void main(String[] args)
	{
		try
		{
			Exception8 e=new Exception8();
			e.fun();
		}
		catch(InvalidRange a)
		{
			System.out.println("Exception!!");
		}

	}
	static void fun()
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a<0)
		{
			throw new InvalidRange(a);
		}
	}
}
	class InvalidRange extends RuntimeException
	{
		InvalidRange(int i)
		{
			System.out.println(i);
		}

	}