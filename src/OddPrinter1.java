public class OddPrinter1 implements Runnable{

    public void run() {
        for (int i = 1; i < 100; i=i+2) {
            System.out.println("OddPrinter1 thread :" + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
