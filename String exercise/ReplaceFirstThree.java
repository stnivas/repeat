import java.util.Scanner;
public class ReplaceFirstThree {

public static void main(String[] args){
 Scanner input=new Scanner(System.in);
    System.out.println("enter nmae");
	String name=input.next();
	String sub=name.substring(0,3);
	String rep=name.replace(sub, "xyz");
	
	System.out.println(rep);
	
	
	}
  }
	
