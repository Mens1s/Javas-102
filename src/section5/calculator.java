package section5;

import java.util.Scanner;

public class calculator {
    void calc(){
        System.out.println("1 => + \n2 => -\n3 => /\n4 => *");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println(choice);
        System.out.print("ENTER FIRST NUM : ");
        int num1 = scanner.nextInt();

        System.out.print("ENTER SECOND NUM : ");
        int num2 = scanner.nextInt();

        switch (choice) {
            case 1 -> num1 += num2;
            case 2 -> num1 -= num2;
            case 3 -> num1 /= num2;
            case 4 -> num1 *= num2;
            default -> System.out.println("ENTER COOORRRRECCCTTTT NUMBER");
        }
        System.out.println("result : " + num1);
    }
}
