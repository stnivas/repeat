import java.util.Scanner;

public class FindLength{
	public void dog(){
	  System.out.println("PLEASE ENTERT THE YOUR DOG NAME");
          Scanner input=new Scanner(System.in);
          String nameOne=input.next();
 	  System. out.println("NAME LENGTH IS:"+nameOne.length());
                       }
	public void cat(){
           System.out.println("PLEASE ENTERT THE YOUR CAR NAME");
           Scanner input=new Scanner(System.in);
           String nameTwo=input.next();
 	   System.out.println("LENGTH OF CAR:"+nameTwo.length()) ;
                        }
       public void any(){
          System.out.println("PLEASE ENTERT THE YOUR CHOICE");
           Scanner input=new Scanner(System.in);
           String nameThree=input.next();
 	   System.out.println("LENGTH OF YOUR CHOICE:"+nameThree.length());
                       }
	public static void main(String[] args){
            	FindLength obj=new FindLength();
    	     	obj.dog();
		        obj.cat();
           	    obj.any();
                    }
              }

               
	  
