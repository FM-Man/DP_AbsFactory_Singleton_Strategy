package Singletons;

public class Enemy {
    private static Enemy instance;
    private double health;
    private int id;

    private Enemy(int id){
        instance = this;
        health = 1000;
        this.id = id;
    }

    public static Enemy getInstance(){
        if(instance==null)
            instance = new Enemy(1);
        return instance;
    }

    public void eatDamage(double damage){
        health -= damage;
        System.out.println("enemy "+id+" ate "+ damage+" damage. new health "+health);
        if(health<=0){
            gotKilled();
        }
    }

    private void gotKilled(){
        System.out.println("enemy "+id+" got killed.");
        Game.getInstance().setEnemy(new Enemy(id+1));
        System.out.println("new enemy "+id+" health: "+health);
    }
}
