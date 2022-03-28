package Weapons;

import Singletons.Enemy;

public class Tank extends Weapon{
    private double speed;
    private double range;

    public Tank(String name, double speed, double range, double damage){
        super(name,damage);
        this.speed = speed;
        this.range = range;
    }

    @Override
    public void dealDamage() {
        System.out.println(name+" dealt "+damage+" damage to the enemy at "+speed+" speed from "+range+" km far.");
        Enemy.getInstance().eatDamage(damage);
        System.out.println("--------------------");
    }
}
