package observer.demo1;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject{

    List<Observer> observerList = new ArrayList<>();
    private int flag;


    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(int i=0;i<observerList.size();i++)
        {
            observerList.get(i).update();
        }
    }
}
