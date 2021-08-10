import java.util.Scanner;
 public class FindLength{

   public static void main(String[] args){
     Scanner input=new Scanner(System.in);
  
     System.out.println("enter  your name");
     String name=input.next();
     int lengthOfName=name.length();
     System.out.println("length of your name:"  +lengthOfName);
  } 
}
