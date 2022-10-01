package A_JavaBasics.section5;

import java.util.Scanner;

public class findMaks {
    void findIT(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int num1 = scanner.nextInt();

        System.out.print("Enter Second Number : ");
        int num2 = scanner.nextInt();

        System.out.print("Enter Third Number : ");
        int num3 = scanner.nextInt();

        if (num1>num2){
            if(num1>num3){
                System.out.println("MAKS : "+ num1);
            }
            else
                System.out.println("MAKS : "+ num3);
        }
        else{
            if (num2>num3)
                System.out.println("MAKS : "+num2);
            else
                System.out.println("MAKS : "+ num3);
        }
    }
}
