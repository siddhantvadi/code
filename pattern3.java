import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int num=1;
        for(int i=1;;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
                if(num>n){
                break;
            }
            }
            System.out.println();
            //because i can also exceed n
            if(num>n){
                break;
            }
        }
    }
}
