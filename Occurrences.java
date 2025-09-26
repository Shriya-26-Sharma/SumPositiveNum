import java.util.*;
class Occurrences {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size ");
    int size=sc.nextInt();
    System.out.println("Enter the numbers");
    int arr []=new int [size];
    for(int i=0;i<size;i++){
      arr [i]=sc.nextInt();
    }
    System.out.println("Enter the number you want to search");
    int numSearch=sc.nextInt();
    int occ=countOccurrence(arr, numSearch);
    System.out.println("Your Element Occurred : "+occ+" times.");
    sc.close();
    } 
   public static int countOccurrence(int arr[],int numSearch){
      int occ =0;
      for(int i=0;i<arr.length;i++){
         if(arr[i]==numSearch){
         occ++;
         }
      }
      return occ;
   }
}
