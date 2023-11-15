public class Main {
    public static void main(String[] args) {

//        Runnable oddPrinter1=new OddPrinter1();
//        Thread oddPrinter=new Thread(oddPrinter1);
//
//        oddPrinter.start();

//        new OddPrinter2().start();

//        Thread oddPrinter1=new Thread(new OddPrinter1());
//        oddPrinter1.start();

        Thread thread=new Thread(
        new Runnable() {
            public void run() {
                for (int i = 1; i < 100; i = i + 2) {
                    System.out.println("runnable thread :" + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ie) {
                        ie.printStackTrace();
                    }

                }
            }
        });
        thread.setName("ddd");
        System.out.println(thread.getName());
        thread.start();



        for (int i = 2; i < 102;
             i = i + 2) {
            System.out.println("main thread: " + i);
            try {
                Thread.sleep(500); //thread라는 클래스에서 제공하는 sleep 메소드 이용. 0.5초
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    } //main


}