import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        task3 ex3=new task3();
        System.out.println("Black jack: "+ex3.blackjack(a,b));
    }
    public int blackjack(int a, int b){
        if (a > 21 && b > 21){
            return 0;
        } else if (a <= 21 && b > 21) {
            return a;
        }
        else if (b <= 21 && a > 21) {
            return b;
        }else if (a >= 21 && b >= 21 && a>b){
            return a;
        }

        return b;
    }
}
