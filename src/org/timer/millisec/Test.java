package org.timer.millisec;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {


    public void printNumber() {

        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
            try {
                TimeUnit.SECONDS.sleep(1);

            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public void testThread() {

        ExecutorService exec = Executors.newFixedThreadPool(1);

        exec.execute(() -> System.out.println("Running a thread " + Thread.currentThread()));
    }


    public static void main(String[] args) {
        Test t = new Test();
        //t.printNumber();
        t.testThread();
    }
}


