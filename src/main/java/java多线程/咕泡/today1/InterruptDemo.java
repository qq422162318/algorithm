package java多线程.咕泡.today1;

import java.util.concurrent.*;

public class InterruptDemo implements Callable<String>{
    private static int i=0;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Thread thread = new Thread(()->{
            while (!Thread.currentThread().isInterrupted()){//没打断状态一直自增
                i++;
            }
            System.out.println(i);
        });
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        thread.interrupt();//设置打断状态
//        ThreadPools();
    }
    public static void ThreadPools() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> future = executorService.submit(new InterruptDemo());
        System.out.println(future.get().toString());
        executorService.shutdown();
    }

    @Override
    public String call() throws Exception {
        return "string"+i;
    }
}
