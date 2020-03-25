public class ThreadExample {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 9; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 9; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        });
        t1.setName("t1");
        t1.run();
        t1.start();
        t2.setName("t2----");
        t2.run();
        t2.start();

    }
}
