package AbstractFactory;

import Weapons.Artillery;
import Weapons.Flakvierling;
import Weapons.KatushaRocket;

public class ArtilleryCreator {
    public Artillery createArtillery(int i){
        if(i<17) return new KatushaRocket(i);
        else return new Flakvierling(i);
    }
}
