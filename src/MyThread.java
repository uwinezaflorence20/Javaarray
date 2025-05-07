public class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.setName("Thread-1");

        MyThread thread2 = new MyThread();
        thread2.setName("Thread-2");

        thread1.start();
        thread2.start();
    }
}
