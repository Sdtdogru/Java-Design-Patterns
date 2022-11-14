package observer.demo2;

public interface ISubject {
    void register(IObserver iObserver);
    void unregister(IObserver iObserver);
    void notifyObserver(int i);

}
