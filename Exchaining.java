class Exchaining
{

		void m()
		{
		int d=50/0;			
		}
		void n()
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
				System.out.println("Exception handled");
			}

		}
		public static void main(String[] arg)
		{
			Exchaining ob=new Exchaining();
			ob.p();
		}

}