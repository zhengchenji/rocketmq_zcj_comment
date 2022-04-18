package com.company;

import javax.management.QueryEval;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolExecutorDemo {
    private static final int CORE_POOL_SIZE = 5;
    private static final int MAX_POOL_SIZE = 10;
    private static final int QUEUE_CAPACITY = 100;
    private static final Long KEEP_ALIVE_TIME = 1L;

    public static void main(String[] args) {
//        ThreadPoolExecutor executor=new ThreadPoolExecutor(CORE_POOL_SIZE,MAX_POOL_SIZE,KEEP_ALIVE_TIME, TimeUnit.SECONDS,
//                new ArrayBlockingQueue<>(QUEUE_CAPACITY),new ThreadPoolExecutor.CallerRunsPolicy());
//        for(int i=0;i<10;i++){
//            Runnable work=new MyRunnable(""+i);
//            executor.execute(work);
//        }
//        executor.shutdown();
//        while(!executor.isTerminated()){
//
//        }
//        System.out.println("Finished all threads");

        AtomicInteger count=new AtomicInteger();
        System.out.println(count);
        int i=count.getAndIncrement();
        System.out.println(i);
        int j=count.incrementAndGet();
        System.out.println(j);

    }
}
