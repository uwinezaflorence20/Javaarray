public class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("Thread " + name + " is running");
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": count - " + i);
            try {
                Thread.sleep(5000);

            } catch (InterruptedException e) {
                System.out.println(name + " interrupted");

            }
        }

    }

    public static void main(String[] args) {

        MyRunnable r1 = new MyRunnable("Task thread 1");
        MyRunnable r2 = new MyRunnable("Task thread 2");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
        System.out.println("Main thread continue to execute");
    }
}