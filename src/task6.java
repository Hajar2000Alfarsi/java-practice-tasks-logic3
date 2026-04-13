import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        System.out.println("Enter third number: ");
        int c=sc.nextInt();
        task6 ex6=new task6();
        System.out.println("evenly spaced: "+ex6.evenlySpaced(a,b,c));
    }
    public boolean evenlySpaced(int a, int b, int c) {
        int small = Math.min(a, Math.min(b, c));
        int large = Math.max(a, Math.max(b, c));
        int middle = a + b + c - small - large;

        return (middle - small) == (large - middle);
    }
}
