import java.util.Scanner;

  public class CaseInSensitive{

    public void  checkCaseInSensitive(){

       Scanner input=new Scanner(System.in);
       System.out.println("enter the any word");
       String firstWord=input.next();
       System.out.println("enter the any word");
       String secondWord=input.next();
       System.out.println("enter the any word");
       firstWord = firstWord.toLowerCase();
       secondWord = secondWord.toLowerCase();
       if(firstWord.equals(secondWord)){
       System.out.println("true");
       }
       else{
       System.out.println("false");
       }
       }
         public static void main (String[] args){
               CaseInSensitive obj=new CaseInSensitive();
               obj. checkCaseInSensitive();
               }
               }
               
        

