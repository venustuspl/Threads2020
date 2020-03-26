import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample {

    public static void main(String[] args) {


        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(() -> numbers());
        executorService.submit(() -> numbers());

    }

    public static void numbers() {
        for (int i = 0; i < 999; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }


//        Thread t1 = new Thread(() -> {
//                for (int i = 0; i < 9; i++) {
//                    System.out.println(Thread.currentThread().getName() + " " + i);
//
//            }
//        });
//
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 9; i++) {
//                    System.out.println(Thread.currentThread().getName() + " " + i);
//                }
//            }
//        });
//        t1.setName("t1");
//
//        t1.start();
//        t2.setName("t2----");
//        t2.setPriority(10);
//
//        t2.start();

}

