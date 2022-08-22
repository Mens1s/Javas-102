package section6;

import java.util.Objects;
import java.util.Scanner;

public class Login {
    void login(){
        String oUsername = "mens1s";
        String oPassword = "yeahPassword";
        boolean flag  = false;

        Scanner scanner = new Scanner(System.in);

        while (!flag){
            System.out.println("Enter Username : ");
            String username = scanner.nextLine();

            System.out.println("Enter password : ");
            String password = scanner.nextLine();

            flag = Objects.equals(password, oPassword) && Objects.equals(username, oUsername);
        }
    }
}
