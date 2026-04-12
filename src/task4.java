import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        System.out.println("Enter third number: ");
        int c=sc.nextInt();
        task4 ex4=new task4();
        System.out.println("No Teen Sum: "+ex4.loneSum(a,b,c));
    }
    public int loneSum(int a, int b, int c){
        int sum=0;
        if(a == b && b == c) {
            sum = 0;
        } else if (b == c) {
            sum = a;
        } else if (a == c) {
            sum = b;
        } else if (a == b ) {
            sum = c;
        }else{
            sum = a + b + c;
        }
        return sum;
    }
}
