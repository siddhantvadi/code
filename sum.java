import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < num; i++) {
            if (i % 2 != 0) {
                sum1 += arr[i];
            } else {
                sum2 += arr[i];
            }
        }
        System.out.println("Sum of even digits of the number is : " + sum1);
        System.out.println("Sum of odd digits of the number is : " + sum2);
    }
}
