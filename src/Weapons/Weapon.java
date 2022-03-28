package Weapons;

public abstract class Weapon {
    String name;
    double damage;
    public Weapon(String name, double damage){
        this.name = name;
        this.damage = damage;
    }

    public abstract void dealDamage();
}
