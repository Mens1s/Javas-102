package A_JavaBasics.section6;

import java.util.Objects;
import java.util.Scanner;

public class atm {
    void Atm(){
        Scanner scanner = new Scanner(System.in);
        String choice;
        int bakiye = 1000;
        do {
            System.out.println("Enter Your Choice : ");
            choice = scanner.nextLine();

            if (Objects.equals(choice, "1"))
                System.out.println("Bakiye : "+ bakiye);
            else if(Objects.equals(choice, "2")) {
                System.out.println("Enter amount of money : ");
                int temp = scanner.nextInt();
                scanner.nextLine();
                bakiye -= temp;
            }
            else if(Objects.equals(choice, "3")) {
                System.out.println("Enter amount of money : ");
                int temp = scanner.nextInt();
                scanner.nextLine();
                bakiye += temp;
            }

        }while (!Objects.equals(choice, "q"));



    }
}
