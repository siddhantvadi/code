import java.lang.Thread;
public class Main{
    public static void main(String[] args){
        MyClassThread t1=new MyClassThread();
 z       t1.start();
        System.out.println("Hello World");
    }
    
}
class MyClassThread extends Thread {
    int sum;
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            sum += i;
        }System.out.println(sum);
    }
}

interface Runnable{
    void run();
}


class MyClassThreadThread implements Runnable{
    int sum;
    @Override
    public void run(){}
}

//to start a thread
//register the newly created thread with a thread scheduler
//perform mandatory tasks
//calls run function


//every process has its own memory
//code - implements instructions
// data - has variables global and static
// heap - dynamic memory contains objects or memory assigned in run time
// and stack - how and where to return
// section of every process
//thread is lightweight process, smallest part of process
// every thread has its own code data heap and stack process
// context switching and inter-thread communication in threads is easier
