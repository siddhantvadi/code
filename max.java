import java.util.Scanner;
public class max {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n-i;j++){
                if(arr[j]>arr[i]){
                    max=arr[j];
                }
            }
        }
        System.out.print(max);
    }
}
