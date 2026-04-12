import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        System.out.println("Enter third number: ");
        int c=sc.nextInt();
        task5 ex5=new task5();
        System.out.println("No Teen Sum: "+ex5.roundSum(a,b,c));
    }

    public int round10(int n){
        int reminder = n % 10;
        if (reminder >= 5){
            return n + (10 - reminder);
        }
        return n -reminder;
    }
    public int roundSum(int a, int b, int c){
        return round10(a) + round10(b) +round10(c);
    }

}
