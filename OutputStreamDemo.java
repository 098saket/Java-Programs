import java.io.*;
public class OutputStreamDemo
{
 public static void main(String[] args) throws IOException
 {
  FileOutputStream fos = null;
  String s ="This text will be written in the file";
  byte buff[] = s.getBytes();
  try
  {
    fos = new FileOutputStream("test1.txt");
    for(int i=0;i<buff.length;i++)
    {
      fos.write(buff[i]);
    }
  }
  catch(FileNotFoundException e){System.out.println("File not found");}
  finally{
    fos.close();
  }
 }

}
