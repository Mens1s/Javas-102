package section7;

import java.util.Scanner;

public class Main {
    // methods && functions
    static int fact(int a){
        int res = 1;
        for (int i = 2 ; i <= a ; i++)
            res *= i;
        return res;
    }
    // overloading
    public static int sum(int a, int b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter number : ");

        int a = scnr.nextInt();
        System.out.println(fact(a));

        // overloading
        System.out.println(sum(1,2));
        System.out.println((sum(12,13,56)));

        for(int i = 2 ; i < 1001; i++)
            if (findPrime.isPrime(i))
                System.out.println(i + " : Prime");

        int x1, x2;
        System.out.println("Enter first number : ");
        x1 = scnr.nextInt();

        System.out.println("Enter second number : ");
        x2 = scnr.nextInt();

        System.out.println("Result : "+findEbob.ebob(x1,x2));
    }
}
