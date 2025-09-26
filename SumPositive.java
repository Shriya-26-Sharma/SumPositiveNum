import java.util.*;
class SumPositive {
 public static void main(String[] args) {
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter the size");
  int size=sc.nextInt();
  System.out.println("Enter numbers:");
  int arr[]=new int[size];
  for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
  }
  int sum=0;
  for(int i=0;i<arr.length;i++){
    if(arr[i]>0){
        sum=sum+arr[i];
    }
  }
  System.out.println("The Positive num sum is:"+sum);
  sc.close();  
 }
}
