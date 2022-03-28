package Weapons;

public class T34 extends Tank{
    private int id;
    public T34(int id) {
        super("T34-"+id, 10, 5, 6);
        this.id = id;
    }
}
