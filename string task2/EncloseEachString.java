import java.util.Arrays;
import java.util.Scanner;
public class EncloseEachString{

	public  static void main(String[] args){
	   Scanner input=new Scanner(System.in);
	   System.out.println("enter the statements");
	   String multi=input.nextLine();
	   String array[]= multi.split(" ");
	   System.out.println(Arrays.toString(array));
	   }
	   }
