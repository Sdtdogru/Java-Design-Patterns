package observer.demo3;

import java.util.ArrayList;
import java.util.List;

class Subject2 implements ISubject
{
    private int myValue;

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
        //Notify observers
        notifyObservers(myValue);
    }

    List<IObserver> observersList=new ArrayList<>();

    @Override
    public void register(IObserver o)
    {
        observersList.add(o);
    }
    @Override
    public void unregister(IObserver o)
    {
        observersList.remove(o);
    }
    @Override
    public void notifyObservers(int updatedValue)
    {
        for(int i=0;i<observersList.size();i++)
        {
            observersList.get(i).update(this.getClass().getSimpleName(),updatedValue);
        }
    }
}
