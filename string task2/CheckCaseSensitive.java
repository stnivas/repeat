import java.util.Scanner;
public class CheckCaseSensitive{



  public void check(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the words");
        String first=input.next();
        System.out.println("enter the words");
        String second=input.next();
        if(first.equals(second)){
        System.out.println("true");
        }
        else{
        System.out.println("false");
          }
         }
       
   public static void main(String[] args){
      CheckCaseSensitive obj=new CheckCaseSensitive();
       obj.check();
         
     }
     }
