package AbstractFactory;

import Weapons.Sherman;
import Weapons.T34;
import Weapons.Tank;

public class TankCreator {
    public Tank createTank(int i){
        if(i<8){
            return new T34(i);
        }
        else{
            return new Sherman(i);
        }
    }
}
