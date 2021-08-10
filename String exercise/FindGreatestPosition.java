import java.util.Scanner;
public class FindGreatestPosition{

public static void main(String[] args){
  Scanner input=new Scanner(System.in);
  
  System.out.println("enter the name");
  String  name=input.next();
  System.out.println("enter the character");
  char letter=input.next().charAt(0);
  
  System.out.println(name.lastIndexOf(letter));
  //for(int i=name.length()-1; i>=0; i--){
    //if(name.charAt(i)==letter){
	
	//System.out.println("gretest position Of:"+i);
	//break;
	//}else if(i==0){
		
	
   // }
	
    }

}

