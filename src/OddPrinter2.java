public class OddPrinter2 extends Thread {

    public void run() {

        for (int i = 0; i < 100; i = i + 2) {

            System.out.println("OddPrinter2 thread : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ioe) {
                ioe.printStackTrace();
            }

        }


    }
}



