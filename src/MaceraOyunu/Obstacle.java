package MaceraOyunu;

import java.util.Random;

public class Obstacle {
    private int damage;
    private int health;
    private String name;
    private int award;
    private int originalHealth;

    public Obstacle(int damage, int health, String name, int award, int originalHealth){
        this.damage = damage;
        this.health = health;
        this.name = name;
        this.award = award;
        this.originalHealth = originalHealth;
    }

    public static int obstacleNumber(int a){
        Random rn = new Random();
        return rn.nextInt(a) + 1;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
}
