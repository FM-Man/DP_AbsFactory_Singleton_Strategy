import java.util.ArrayList;

public class WeaponCreator {
    ArrayList<Weapon> weapons = new ArrayList<>();
    public WeaponCreator(){
        createWeapons();
    }
    private void createWeapons(){
        TankCreator tankCreator = new TankCreator();
        ArtilleryCreator artilleryCreator = new ArtilleryCreator();

        for (int i=0; i<20; i++){
            if(i<13){
                weapons.add(tankCreator.createTank(i));
            }
            else weapons.add(artilleryCreator.createArtillery(i));
        }
    }
    public ArrayList<Weapon> getWeapons(){
        return weapons;
    }
}
