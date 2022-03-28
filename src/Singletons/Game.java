package Singletons;

import AbstractFactory.WeaponCreator;
import Weapons.Weapon;

import java.util.ArrayList;
import java.util.Collections;

public class Game {
    private static Game instance;
    private Enemy enemy = Enemy.getInstance();
    private ArrayList<Weapon> weapons;

    private Game(){
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
        for(int i=0; i<20;i++){
            Collections.shuffle(weapons);
            for (Weapon weapon : weapons) {
                weapon.dealDamage();
            }
        }
    }

    public void setEnemy(Enemy enemy){
        this.enemy = enemy;
    }
}
