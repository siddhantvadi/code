import java.util.Scanner;
public class Leader {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        int count=1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                count++;
            }
        }
        int[] a=new int[count];
        int max=0;
        for(int i=0;i<n-1;i++){
            max=arr[i];
            for(int j=0;j<n-1;j++){
                if(arr[i]<arr[j]){
                    max=arr[j];
                }
            }
        }
        
    }
}
