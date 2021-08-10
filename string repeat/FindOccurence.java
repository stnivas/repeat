import java.util.Scanner;
 
   public class FindOccurence{
		
		public static void main(String[] args){
		  Scanner input = new Scanner(System.in);
		  System.out.println("ENTER ANY STRING");
		  String string=input.next();
		  System.out.println("ENTER ANY CHARACTER");
		  char character=input.next().charAt(0);
          int count=0;
		  char[] convert=string.toCharArray();
		  for(int str=string.length()-1; str>=0;str--){
		  if(character==convert[str]){
			  
		   count++;
		  }
		    else if(System.out.println("NO OCCURENCE OF GIVEN STRING")){
		   //System.out.println("NO OCCURENCE OF GIVEN STRING");
		  }
		  }
		   System.out.println("count occurence" +count);
		   }
		   }
		  