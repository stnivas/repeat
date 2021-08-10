import java.util.Scanner;

   public class WithOutSpace{
   
     public void  notspace(){
      Scanner scan=new Scanner(System.in);
      System.out.println("enter the any statements");
      String stm=scan.nextLine();
      System.out.println(stm.trim());
      }
       public static void main(String[] args){
        WithOutSpace obj=new WithOutSpace();
        obj.notspace();
        }
        }
    
