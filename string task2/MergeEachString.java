import java.util.Arrays;
import java.util.Scanner;
public class MergeEachString{

	public  static void main(String[] args){
	   Scanner scan=new Scanner(System.in);
	   System.out.println("enter the size");
	    int input=scan.nextInt();
	    String array[]=new String [input];
	    for(int i=0;i<input;i++) {
	    array[i] = scan.nextLine();
	    }
	    String s = "";
	    for(int i=0;i<input;i++) {
	    s = s + array[i];
	    s = s + "-";
	    }
	    System.out.println(s);
	    }
	   }
