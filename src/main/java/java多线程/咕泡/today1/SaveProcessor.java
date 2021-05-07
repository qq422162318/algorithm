package java多线程.咕泡.today1;

import java.util.concurrent.LinkedBlockingQueue;

public class SaveProcessor extends Thread implements RequestProcessor {
    LinkedBlockingQueue<Request> linkedBlockingQueue = new LinkedBlockingQueue();

    @Override
    public void processorRequest(Request request) {
        System.out.println("save");
        linkedBlockingQueue.add(request);
    }

    @Override
    public void run() {
        try {
            Request request = linkedBlockingQueue.take();
            System.out.println(request);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
