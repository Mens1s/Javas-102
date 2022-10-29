package J_ExceptionHandling;

import java.util.Scanner;

public class Main {
    public static void checkAge(int age) throws AgeCheckException {
        if (age < 18)
            throw new AgeCheckException("NOT ALLOWED!");
        System.out.println("Allowed");
    }
    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 20;

        try{
            int test = input.nextInt();
            System.out.println(b/a);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Definitely works here");
        }
        System.out.println("continue....");
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter age");
        try{
            int age = input.nextInt();
            checkAge(age);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class MyCalculator{
    // n^^p
    public String power(int n, int p) throws Exception {
        try{
            if (n < 0 || p < 0)
                throw(new Exception("java.lang.Exception: n or p should not be negative."));
            if (n== 0 && p == 0)
                throw(new Exception("java.lang.Exception: n and p should not be zero."));
            long res = 1;
            for(int a = 0; a < p ; a++)
                res *= n;
            return ""+res;
        }catch(Exception e){
            return e.getMessage();
        }

    }
}

class Solution {
    public static void mains(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()){
            int a = input.nextInt();
            int b = input.nextInt();
            MyCalculator calc = new MyCalculator();
            try {
                System.out.println(calc.power(a, b));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}