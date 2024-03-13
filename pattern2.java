import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int k=2;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
        
    }
}
