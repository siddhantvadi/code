import java.util.Scanner;

public class kmo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        boolean[][] a = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    a[i][j] = true;
                }

                if (a[i + 1][j] == true || a[i - 1][j] == true || a[i][j + 1] == true || a[i][j - 1] == true) {
                    a[i][j] = true;
                }

                if(i==m-1){}
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == true) {
                    arr[i][j] = 0;
                }

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
