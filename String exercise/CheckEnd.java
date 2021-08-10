
import java.util.Scanner;

public  class CheckEnd{

public static void main (String [] args){
  Scanner input =new Scanner(System.in);
  System.out.println("enter name");
  String name=input.next();
  boolean present=name.endsWith("le");
  System.out.println(present);
  }
  }
