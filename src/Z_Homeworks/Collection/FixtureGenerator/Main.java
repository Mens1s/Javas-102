package Z_Homeworks.Collection.FixtureGenerator;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        GenerateFixture gen = new GenerateFixture();


        System.out.println("Enter team names, when you done print Q...\n");

        while(gen.addTeam(scn.nextLine()) != -1);

        gen.display(gen.generate());

    }
}
