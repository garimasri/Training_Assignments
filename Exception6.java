import java.util.Scanner;
class Exception6
{
	public static void main(String[] arg)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter an integer value:");
			int val=sc.nextInt();
			if(val<0)
				/*IllegalArgumentException ob=new IllegalArgumentException();
			throw ob;*/
			throw new IllegalArgumentException();
		}
		catch (IllegalArgumentException e)
		{
			System.out.println("number is not feasible");
		}
	}

}