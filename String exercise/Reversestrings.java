import java.util.Scanner;
 public class ReverseWords{
   public  static void main (String [] args){
      Scanner input=new Scanner
      String name=input.next();
       String rev="";
   
   for(int i=name.length()-1; i>=0;i--){
    rev=rev+name.charAt(i);
}
  System.out.println("string reverse:" +rev);
}
}
