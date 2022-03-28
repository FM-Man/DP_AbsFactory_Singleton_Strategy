public class ArtilleryCreator {
    public Artillery createArtillery(int i){
        if(i<17) return new KatushaRocket(i);
        else return new Flakvierling(i);
    }
}
