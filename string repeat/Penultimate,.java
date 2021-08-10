import java.util.Scanner;
 
 public class Penultimates{
 
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("ENTER ANY STRING");
		String string=input.next();
		if(string<3){
			System.out.println("PLEASE ENTER MINIMUM THREE CHARACTER");
		 }
		 else{	
		System.out.println(string.charAt(string.length()-2));
		  }
   	} 
 }	
