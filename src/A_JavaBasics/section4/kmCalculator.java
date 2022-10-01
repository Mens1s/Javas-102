package A_JavaBasics.section4;

import java.util.Scanner;

public class kmCalculator {
    public void calc(){
        System.out.println("Enter your payment for per km: ");
        Scanner scn = new Scanner(System.in);

        float tl = scn.nextFloat();
        System.out.println("Enter km taken : ");

        float km = scn.nextFloat();

        System.out.println("You have to pay => " + tl*km + " TL");
    }
}
