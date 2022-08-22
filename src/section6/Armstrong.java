package section6;

import java.util.Scanner;

public class Armstrong {
    void armstrong(){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number : ");
        String temp = scn.nextLine();
        int power = temp.length();
        int num = 0;

        for (int idx = 0 ; idx < power; idx++){
            num += pow(Character.getNumericValue(temp.charAt(idx)),power);
        }
        if (num == Integer.parseInt(temp))
            System.out.println("That is fucking armstrong number!");
        else
            System.out.println("Not a armstrong number..");
    }
    int pow(int a, int b){
        int temp = a;
        for(int c = 0; c < b - 1; c++){
            temp *= a;
        }
        return temp;
    }
}
