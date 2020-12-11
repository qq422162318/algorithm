package java多线程.咕泡.today1;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo {
    PrintProcessor printProcessor;
    SaveProcessor saveProcessor;
    public Demo() {
        saveProcessor = new SaveProcessor();
        saveProcessor.start();
        printProcessor= new PrintProcessor(saveProcessor);
        printProcessor.start();
    }

    public static void main(String[] args) {
        Request request = new Request();
        request.setName("mic");
        new Demo().doTest(request);
    }
    public void doTest(Request request){
        printProcessor.processorRequest(request);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Stream<Request> stream = saveProcessor.linkedBlockingQueue.stream();
        System.out.println(stream.count());

    }
}
