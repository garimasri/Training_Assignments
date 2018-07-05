import java.io.*;
class FileCreate
{
public static void main(String[] ar)
{
	try
	{
		File file=new File("t1.txt");
		if(file.createNewFile())
		{
			System.out.println("New file created");
		}
		else
		{
			System.out.println("file already exist");
		}
	}catch(IOException e)
	{
		e.printStackTrace();
	}
}
}