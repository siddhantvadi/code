import java.util.Scanner;

public class Twod{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int[] x:arr){
            for(int y:x){
                System.out.print(y);
            }
        }

    }
}