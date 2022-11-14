package Thread;

public class ExtendingThread extends Thread{
    public void run(){
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        ExtendingThread tr = new ExtendingThread();
        tr.start();
    }
}

class Multi3 implements Runnable{
    public void run(){
        System.out.println("thread is running...");
    }

    public static void main(String args[]){
        Multi3 m1=new Multi3();
        Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)
        t1.start();
    }
}

class MyThread1 extends Thread
{
    public static void main(String argvs[])
    {
        Thread t= new Thread("My first thread");

        t.start();
        String str = t.getName();
        System.out.println(str);
    }
}
class MyThread2 implements Runnable
{
    public void run()
    {
        System.out.println("Now the thread is running ...");
    }

    // main method
    public static void main(String argvs[])
    {
// creating an object of the class MyThread2
        Runnable r1 = new MyThread2();

// creating an object of the class Thread using Thread(Runnable r, String name)
        Thread th1 = new Thread(r1, "My new thread");

// the start() method moves the thread to the active state
        th1.start();

// getting the thread name by invoking the getName() method
        String str = th1.getName();
        System.out.println(str);
    }
}

class RunExp3 extends Thread
{
    public void run()
    {
        for(int i=1;i<6;i++)
        {
            try
            {
             Thread.sleep(5000);
            }catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        RunExp3 t1=new RunExp3();
        RunExp3 t2=new RunExp3();
        t1.run();
        t2.run();
    }
}

// DefaultThreadGroup.java
class DefaultThreadGroup {
    public static void main(String[] args) {
        // Get the current thread, which is called "main"
        Thread t1 = Thread.currentThread();
        // Get the thread group of the main thread
        ThreadGroup tg1 = t1.getThreadGroup();
        System.out.println("Current thread's name: " + t1.getName());
        System.out.println("Current thread's group name: " + tg1.getName());
        // Creates a new thread. Its thread group is the same that of the main thread.
        Thread t2 = new Thread("my new thread");
        ThreadGroup tg2 = t2.getThreadGroup();
        System.out.println("New thread's name: " + t2.getName());
        System.out.println("New thread's group name: " + tg2.getName());
    }
}

class twoThread extends Thread{
    public void run(){
        for (int i = 0; i<100;i++)
            System.out.println("2. thread");
    }


    public static void main(String[] args) throws InterruptedException {
        twoThread thread = new twoThread();
        thread.start();
        thread.join();
        for (int i = 0; i<100;i++)
            System.out.println("1. thread");
    }
}