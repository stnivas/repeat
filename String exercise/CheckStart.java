import java.util.Scanner;

public  class CheckStart{

public static void main (String [] args){
  Scanner input =new Scanner(System.in);
  System.out.println("enter name");
  String name=input.next();
  boolean present=name.startsWith("ed");
  System.out.println(present);
  }
  }
