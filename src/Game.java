import java.util.ArrayList;
import java.util.Collections;

public class Game {
    private static Game instance;
    private Enemy enemy = Enemy.getInstance();
    private ArrayList<Weapon> weapons;

    public Game(){
        instance=this;
        WeaponCreator weaponCreator = new WeaponCreator();
        weapons = weaponCreator.getWeapons();
    }

    public static Game getInstance(){
        if(instance == null)
            instance = new Game();
        return instance;
    }

    public void play(){
        Collections.shuffle(weapons);
        for(int i=0; i<20;i++){
            for (Weapon weapon : weapons) {
                weapon.dealDamage();
            }
        }
    }

    public void setEnemy(Enemy enemy){
        this.enemy = enemy;
    }
}
