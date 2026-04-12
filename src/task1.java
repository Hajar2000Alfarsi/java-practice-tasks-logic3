import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of small bricks: ");
        int small=sc.nextInt();
        System.out.println("Enter the number of big bricks: ");
        int big=sc.nextInt();
        System.out.println("Enter the number of goal bricks: ");
        int goal=sc.nextInt();
        task1 ex1=new task1();
        System.out.println("Make Bricks: "+ex1.makeBricks(small,big,goal));
    }
    public boolean makeBricks(int small,int big,int goal){
        int maxBigUsed=Math.min(big,goal / 5);
        int remaining= goal-(maxBigUsed*5);
        return remaining<=small;
    }
}
