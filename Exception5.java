class Exception5
{
	public static void main(String[] ma)
	{
		try
		{
			int a=Integer.parseInt(ma[0]);
			try
			{
				int b=Integer.parseInt(ma[1]);
				System.out.println(a/b);
			}
			catch(ArithmeticException e)
			{
				System.out.println("divided by zero error!!");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("need to pass 2 parameters!!");
		}
	}
}