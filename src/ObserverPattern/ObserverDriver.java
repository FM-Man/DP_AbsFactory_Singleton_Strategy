package ObserverPattern;

public class ObserverDriver {
    public static void main(String[] args) {
        Observer bo = new BinaryObserver();
        Observer oo = new OctalObserver();
        Observer ho = new HexadecimalObserver();

        Subject subject = new Subject();
        subject.attach(bo);
        subject.attach(oo);
        subject.setNumber(19);

        System.out.println();

        subject.detach(oo);
        subject.attach(ho);
        subject.setNumber(71);
    }
}
