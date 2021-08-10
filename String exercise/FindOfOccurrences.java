import java.util.Scanner;
public class FindOfOccurrences{

public static void main(String[] args){
  Scanner input=new Scanner(System.in);
  //String name;
  //char letter;
  System.out.println("enter the name");
 String  name=input.next();
  System.out.println("enter the any char");
  char letter=input.next().charAt(0);
  int count=0;
  for(int i=name.length()-1; i>=0;i--){
	  if(name.charAt(i)==letter){
		  
		  count++;
	  } 
 }
 System.out.println(count);
 }
}