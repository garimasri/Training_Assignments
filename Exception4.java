class Exception4
{
	public static void main(String[] arg)
	{
		try
		{
			int a[]=new int[5];
			a[5]=20/0;
		}
		catch(Exception e)
		{
			System.out.println("task3 is completed");
		}
		catch(ArithmeticException e)
		{
         System.out.println("task1 is completed");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("task2 is completed");
		}
		
	}
}