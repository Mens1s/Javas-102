package E_MaceraOyunu;

import java.util.Objects;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Player player = new Player();
        player.selectChar();

        Scanner input = new Scanner(System.in);

        while(player.getHealth() > 0 && !(player.inventory.isFireword() && player.inventory.isFood() && player.inventory.isWater())){
            System.out.println("\n\nWelcome " + player.getName());
            System.out.println("Your health : "+ player.getHealth());
            System.out.println("Your money : "+ player.getMoney());
            System.out.println("Select:\n1- Fight\n2- Go Safe House\n3- Go Market");
            int choice = input.nextInt();

            if(choice == 1){
                System.out.println("\n\nSelect fight area:\n1- Cave\n2- Forest\n3- River\n4- Mine");
                int ch2 = input.nextInt();
                if (ch2 == 1){
                    if (player.inventory.isFood()){
                        System.out.println("You are already fight here!");
                    }
                    else{
                        int enemyCount = Obstacle.obstacleNumber(3);
                        System.out.println("In cave " + enemyCount +" zombie is waiting you. (R)un or (W)arr");
                        String s = input.next();

                        if (Objects.equals(s, "w")){
                            Cave c = new Cave(player);
                            c.combat(enemyCount);
                            if (player.getHealth() > 0)
                                c.win();
                        }
                    }

                }
                else if(ch2 == 2){
                    if (player.inventory.isFireword()){
                        System.out.println("You are already fight here!");
                    }
                    else{
                        int enemyCount = Obstacle.obstacleNumber(3);
                        System.out.println("In cave " + enemyCount +" vampire is waiting you. (R)un or (W)arr");
                        String s = input.next();
                        if (Objects.equals(s, "w")){
                            Forest f = new Forest(player);
                            f.combat(enemyCount);
                            if (player.getHealth() > 0)
                                f.win();
                        }
                    }
                }
                else if(ch2 == 3){
                    if (player.inventory.isWater()){
                        System.out.println("You are already fight here!");
                    }
                    else{
                        int enemyCount = Obstacle.obstacleNumber(3);
                        System.out.println("In cave " + enemyCount +" bear is waiting you. (R)un or (W)arr");
                        String s = input.next();
                        if (Objects.equals(s, "w")){
                            River r = new River(player);
                            r.combat(enemyCount);
                            if (player.getHealth() > 0)
                                r.win();
                        }
                    }

                }
                else if(ch2 == 4){
                    int enemyCount = Obstacle.obstacleNumber(5);
                    System.out.println("In cave " + enemyCount +" snake is waiting you. (R)un or (W)arr");
                    String s = input.next();
                    if (Objects.equals(s, "w")){
                        Mine m = new Mine(player);
                        m.combat(enemyCount);
                        if (player.getHealth() > 0)
                            m.win();
                    }
                }
                else{
                    System.out.println("Enter right fight area you are redirect to main page...");
                }
            }
            else if(choice == 2){
                SafeHouse sf = new SafeHouse(player);
                sf.onLocation();
            }
            else if(choice == 3){
                ToolStore ts = new ToolStore(player);
                ts.onLocation();
            }
            else{
                System.out.println("Enter right number...");
            }
        }
        if(player.getHealth() > 0){
            System.out.println("You win the game...");
        }
        else{
            System.out.println("fAiLeD!");
        }
    }
}
