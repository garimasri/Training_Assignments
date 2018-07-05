import java.io.*;
class Filepr
{
	public static void main(String[] args) throws IOException
	{
   String fname=args[0];
   File f=new File(fname);
   File f1=new File("abc.txt");
   f.createNewFile();
   f1.createNewFile();
   System.out.println("file name"+f.getName());
    System.out.println("Path:"+f.getPath());
    System.out.println("last Modified:"+new java.util.Date(f.lastModified()));
    System.out.println("absolute path:"+f.getAbsolutePath());
    System.out.println("canonical path:"+f.getCanonicalPath());
    System.out.println("Parent:"+f.getParent());
    System.out.println("Exists:"+f.exists());
    if(f.exists())
    {
    	System.out.println(f.canWrite());
    	System.out.println(f.isDirectory());
    	System.out.println(f.length());
    }
    System.out.println(f.renameTo(f1));
	}
}