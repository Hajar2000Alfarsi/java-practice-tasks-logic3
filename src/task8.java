import java.util.Scanner;

public class task8 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of small Chocolate: ");
        int small=sc.nextInt();
        System.out.println("Enter the number of big Chocolate: ");
        int big=sc.nextInt();
        System.out.println("Enter the number of goal Chocolate: ");
        int goal=sc.nextInt();
        task8 ex8=new task8();
        System.out.println("make chocolate: "+ex8.makeChocolate(small,big,goal));
    }

    public int makeChocolate(int small, int big, int goal) {
        int maxBig = Math.min(big, goal / 5);
        int remaining = goal - (maxBig * 5);

        if (small >= remaining) {
            return remaining;
        } else {
            return -1;
        }
    }
}
