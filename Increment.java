import java.util.Scanner;

class Increment
{
  public static void main(String[] args)
  {
    // Write your code here
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<n;i++){
      arr[i]+=1;
      sum+=arr[i]*10;
    }
    System.out.print(sum);
  }
}