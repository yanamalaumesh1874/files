import java.io.File;  
import java.io.IOException;  

public class Createfile {
  public static void main(String[] args)
	  {
    try {
      File myObj = new File("D://java file.txt");
      if (myObj.createNewFile())
		  {
        System.out.println("successfully file was created "+ myObj.getName());
      }
	  else
		  {
        System.out.println("file already exists");
      }
    } 
	catch (IOException e)
	{
      System.out.println("plz check the code ");
      e.printStackTrace();
    }
  }
}
