import java.util.*;
class ExitOnExit {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(true){
    System.out.println("Enter a word :");
     String word =sc.nextLine();
     if(word.equals("exit")){
      break;
     }
    }
    System.out.println("You have Successfully Exited");
   } 
}
