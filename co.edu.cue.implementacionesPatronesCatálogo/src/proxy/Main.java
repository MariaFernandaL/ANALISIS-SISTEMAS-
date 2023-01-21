package proxy;

public class Main {
    public static void main(String[] args) {
        BatchProcess batchProcess= new ProxyBatchProcess("big_file.txt");
        System.out.println("BatchProcess will be loaded from disk");
        batchProcess.process();
        System.out.println("------------");
        System.out.println("BatchProcess will not be loaded from disk");
        batchProcess.process();
    }
}