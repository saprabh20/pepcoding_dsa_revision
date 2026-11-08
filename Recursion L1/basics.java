
import java.util.Scanner;

//High Level Thinking(HLT): Set Expectaions, Make Faith, Meet Faith with Expectations
//Low Level Thinking(LLT): Dry Run, Make Stack, Find out Base case

public class basics {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // System.out.println("Print Decreasing");
        // printDecreasing(n);

        // System.out.println("Print Increasing");
        // printIncreasing(n);

        // System.out.println("Print Decreasing Increasing");
        // PDI(n);

        // System.out.println("Print Factorial");
        // int f = printFactorial(n);
        // System.out.println(f);

        System.out.println("Print Power");
        int x = scn.nextInt();
        int n = scn.nextInt();
        int p = power2(x,n);
        System.out.println(p);

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

    //Expectation:  printDecreasing(4) will print 4,3,2,1
    //Faith: printDecreasing(3) will print 3,2,1
    //Faith meets expectation: printDecrease(n)-> printDecrease(n-1)-> printDecrease(n-2)....3,2,1
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

    //print decreasing increasing
    public static void PDI(int n) {
        if(n==0) {
            return;
        }
        System.out.println(n);
        PDI(n-1);
        System.out.println(n);
        return;
    }

    //Expectation: pf(4): 4x3x2x1
    //Faith: pf(n-1) = pf(3): 3x2x1 (vishwas rakh skta hu ki agar expectation is true this will also bhi true)
    //Faith meets expectation: can we make pf(4) using pf(3)?
    //Yes, pf(4) = 4 x pf(3), i.e. pf(n) = n * pf(n-1)
    public static int printFactorial(int n) {
        //base case
        if(n==1){
            return 1;
        }
        int factorialnm1 = printFactorial(n-1);
        int factorial = n*factorialnm1;
        return factorial;
    }

    //printpower: x^n, n times x, e.g. 2^3, 2*2*2
    //Expectation: power(x,n) => x*x*x..n times, e.g. 2*4 = 2*2*2*2
    //Faith: power(x, n-1)=> x*x*x..n-1 times, e.g. 2*3 = 2*2*2
    //Faith meets expectations: can we make power(2,4) with power(2,3)
    //Yes, power(2,4) = 2*power(2,3) => power(x,n) = x * power(x, n-1)
    public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }
        int pnm1 = power(x, n-1);
        int p = x*pnm1;
        return p;
    }

    public static int power2(int x, int n) {
        if(n == 0) {
            return 1;
        }
        int xnb2 = power2(x, n/2);
        int xn = xnb2*xnb2;
        if(n%2 != 0) {
            xn *= x;
        }
        return xn;
    }
}