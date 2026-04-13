import java.util.Scanner;

public class task7 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        System.out.println("Enter third number: ");
        int c=sc.nextInt();
        task7 ex7=new task7();
        System.out.println("lucky Sum: "+ex7.luckySum(a,b,c));
    }

    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        }
        if (b == 13) {
            return a;
        }
        if (c == 13) {
            return a + b;
        }
        return a + b + c;
    }
}
