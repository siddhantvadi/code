import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(temp!=0){
            int rem=temp%10;
            temp/=10;
            sum+=rem;
        }
        System.out.println(sum);
    }
}
