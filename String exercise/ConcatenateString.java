import java.util.Scanner;
 
 	public class ConcatenateString{
 		
 		public static void main(String[] args){
 		  Scanner input=new Scanner(System.in);
 		  System.out.println("enter the string");
 		  String  string =input.nextLine();

 		  String merge=string.replaceAll(" ", "");
 		  System.out.println(merge);
 		  }
 		  }
 			
