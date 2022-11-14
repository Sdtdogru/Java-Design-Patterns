package observer.demo3;

import java.util.ArrayList;
import java.util.List;

public class Subject1 implements ISubject {

    private int myValue;
    List<IObserver> iObservers = new ArrayList<>();

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
        notifyObservers(myValue);
    }

    @Override
    public void register(IObserver o) {
        iObservers.add(o);
    }

    @Override
    public void unregister(IObserver o) {
        iObservers.remove(o);
    }

    @Override
    public void notifyObservers(int updatedValue) {
        for(int i=0;i<iObservers.size();i++)
        {
            iObservers.get(i).update(this.getClass().getSimpleName(),updatedValue);
        }
    }
}
