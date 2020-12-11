package java多线程.咕泡.today1;

import jdk.nashorn.internal.ir.CallNode;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class PrintProcessor extends Thread implements RequestProcessor {
    LinkedBlockingQueue<Request> linkedBlockingQueue = new LinkedBlockingQueue();
    private final RequestProcessor nextProcessor;

    public PrintProcessor(RequestProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    @Override
    public void processorRequest(Request request) {
        System.out.println("print");
        linkedBlockingQueue.add(request);
    }

    @Override
    public void run() {
        while (true) {
            try {
                //take()获取并移除此队列的头部，在元素变得可用之前一直等待（如果有必要）。
                Request request = linkedBlockingQueue.take();
                System.out.println(request);
                nextProcessor.processorRequest(request);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
