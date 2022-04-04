package ObserverPattern;

public class OctalObserver implements Observer{
    @Override
    public void update(int number) {
        System.out.println("Octal : "+Integer.toOctalString(number));
    }
}
