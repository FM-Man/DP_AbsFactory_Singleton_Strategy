package ObserverPattern;

public class BinaryObserver implements Observer{
    @Override
    public void update(int number) {
        System.out.println("Binary: "+Integer.toBinaryString(number));
    }
}
