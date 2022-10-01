package A_JavaBasics.section4;

import java.util.Scanner;

public class bodyMass_calculator {
    public void bmCal(){
        Scanner scn = new Scanner(System.in);

        int flag = 1;
        while(flag == 1) {
            System.out.println("Enter your height : ");
            if (scn.hasNextInt()) {
                int h = scn.nextInt();
                System.out.println("Enter your mass");
                if (scn.hasNextFloat()) {
                    float m = scn.nextFloat();
                    System.out.println("YOUR BODY_MASS ratio :  " + (m / h * h));
                    flag = 0;
                }
            }
            if(scn.hasNextLine()) scn.nextLine();
        }
    }


}
