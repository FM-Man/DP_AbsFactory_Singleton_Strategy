package ObserverPattern;

public class HexadecimalObserver implements Observer{

    @Override
    public void update(int number) {
        System.out.println("Hex   : "+Integer.toHexString(number));
    }
}
