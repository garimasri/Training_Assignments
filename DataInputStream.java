import java.io.*;
class DataInputStream
{
public static void main(String[] ar) throws IOException,FileNotFoundException
{
	FileInputStream fin=new FileInputStream("t1.txt");
	int i=0;
	while((i=fin.read())!=-1)
	{
		System.out.println((char)i);
	}
	fin.close();

}

}