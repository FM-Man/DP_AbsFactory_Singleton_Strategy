package Weapons;

public class Sherman extends Tank{
    private int id;
    public Sherman(int id) {
        super("Sherman-"+id, 12, 4, 5);
        this.id = id;
    }
}
