package observer.demo2;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject{

    List<IObserver> observerList = new ArrayList<>();
    private int myValue;

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
        notifyObserver(myValue);
    }

    @Override
    public void register(IObserver iObserver) {
        observerList.add(iObserver);
    }

    @Override
    public void unregister(IObserver iObserver) {
        observerList.remove(iObserver);
    }

    @Override
    public void notifyObserver(int updatedValue) {
        for(int i=0;i<observerList.size();i++)
        {
            observerList.get(i).update(updatedValue);
        }
    }
}
