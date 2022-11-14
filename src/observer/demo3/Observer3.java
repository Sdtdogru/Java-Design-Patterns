package observer.demo3;

public class Observer3 implements IObserver{
    @Override
    public void update(String s, int i) {
        System.out.println("Observer3: observes ->myValue is changed in "+s+" to :"+i);
    }
}
