
import java.util.Scanner;

//High Level Thinking(HLT): Set Expectaions, Make Faith, Meet Faith with Expectations
//Low Level Thinking(LLT): Dry Run, Make Stack, Find out Base case

public class basics {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // System.out.println("Print Decreasing");
        // printDecreasing(n);

        // System.out.println("Print Increasing");
        // printIncreasing(n);

        System.out.println("Print Decreasing Increasing");
        PDI(n);
    }

    //Template
    public static void RecursionExample(int n) {
        //base case
        if(n==0) {
            return;
        }
        //area1: Before the recursive call, goes up in the stack first
        System.out.println(n);

        //recursive call
        RecursionExample(n-1);

        //area2: After the recursive call, comes down in the stack
        System.out.println(n);

        return;
    }
    public static void printDecreasing(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
        return;
    }

    public static void printIncreasing(int n) {
        if(n == 0) {
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
        return;
    }

    //print decreating increating
    public static void PDI(int n) {
        if(n==0) {
            return;
        }
        System.out.println(n);
        PDI(n-1);
        System.out.println(n);
        return;
    }
}