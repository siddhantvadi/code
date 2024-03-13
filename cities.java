import java.util.Scanner;
public class cities {
    public static void main(String[] args){
        int np,a,b,c,num;
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        num = number.nextInt();
        int[] nc=new int[num];
        for(int i=0;i<num;i++){
            System.out.print("Enter the population of City "+ (i+1) +": ");
            nc[i]=number.nextInt();
        } 
        System.out.print("Enter the number of phases: ");
        np = number.nextInt();
        int sum=0;
        while(np!=0){
           System.out.print("Enter the Starting city: ");
           a = number.nextInt();
           System.out.print("Enter the Ending city: ");
           b = number.nextInt();
           System.out.print("Enter the population to be displaced: ");
           c = number.nextInt();
           for(int i=a-1;i<b;i++){
            nc[i]+=c;
           }
           
           np--;
        }
        for(int i=0;i<num;i++){
            sum+=nc[i];
           }
        int avg=sum/num;
        System.out.println("The average population of each city is: " +avg);
    }
}