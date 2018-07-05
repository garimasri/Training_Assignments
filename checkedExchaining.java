import java.io.IOException;
class checkedExchaining
{
	void m() throws IOException
	{ 
		throw new IOException();
	}
	void n() throws IOException
	{
		m();
	}
	void p()
	{
		try
		{
			n();
		}
		catch(Exception e)
		{
			System.out.println("exception!!");
		}
	}
	public static void main(String[] arh)
	{
		checkedExchaining b=new checkedExchaining();
        b.p();
	}
}