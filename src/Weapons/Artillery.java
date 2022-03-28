package Weapons;

import Singletons.Enemy;

public class Artillery extends Weapon{
    private double range;

    public Artillery(String name, double range, double damage){
        super(name,damage);
        this.range = range;
    }

    @Override
    public void dealDamage() {
        System.out.println(name+" dealt "+damage+" damage to the enemy from "+range+" km far.");
        Enemy.getInstance().eatDamage(damage);
        System.out.println("--------------------");
    }
}
