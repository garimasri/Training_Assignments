import java.util.Scanner;
public class computer
{
	public static void main(String[] ar)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter first no..");
        int a=sc.nextInt();
        System.out.println("enter second no..");
        int b=sc.nextInt();
        int c=a/b;
        System.out.println("Result:"+c);
	}
}