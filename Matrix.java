import java.util.Scanner;
public class Matrix {
    public static void main(String[] args){
        int row,col;
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        col=sc.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt(); j
            }
        }
    }
}
