import java.io.*;
public class biodata
{
 public static void main(String[] args){
  BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
  String name = "";
  String npm = "";
  String alamat = "";
  
  try
  {
   System.out.print("Input Nama  : ");
   name = dataIn.readLine();
   System.out.print("Input NPM  : ");
   npm = dataIn.readLine();
   System.out.print("Input Alamat  : ");
   alamat = dataIn.readLine();
   System.out.println("");
   System.out.println("");
  }
  catch( IOException e )
  {
   System.out.println("Error!");
  }
   
  System.out.println("-------------------BIODATA----------------------");
  System.out.println("Nama  : " + name);
  System.out.println("NPM  : " + npm);
  System.out.println("Alamat  : " + alamat);
 System.out.println("Moto  : Yang menjadi penyesalan saat ini adalah tidak bertanya saat tidak mengerti" );
  System.out.println("------------------------------------------------");
 }
}