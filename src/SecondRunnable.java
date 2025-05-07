public class SecondRunnable implements Runnable {
    private String name;

    public SecondRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("The thread " + name + " is running");

        for (int i = 0; i < 5; i++) {
            System.out.println(name + " is running " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread " + name + " was interrupted.");
            }
        }
    }

    public static void main(String[] args) {

        SecondRunnable task1 = new SecondRunnable("Task 1");
        Thread t1 = new Thread(task1);
        t1.start();


        SecondRunnable task2 = new SecondRunnable("Task 2");
        Thread t2 = new Thread(task2);
        t2.start();



    }
}
