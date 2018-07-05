import java.util.Scanner;
public class computer1
{
	public static void main(String[] ar)
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter first no..");
        int a=sc.nextInt();
        System.out.println("enter second no..");
        int b=sc.nextInt();
        int c=a/b;
        System.out.println("Result:"+c);
	}
catch(ArithmeticException e)
{
	System.out.println("cannot divided by zero");
}
}
}