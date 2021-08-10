import java.util.Scanner;

 public class StringToArray{
 
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("ENTER ANY STRING");
		String string=input.next();
		char[]array=string.toCharArray();
		System.out.println(array);
		System.out.println(" im print first character:"+array[0]);
		    }
		}