public class ThreadExercise {
    private static final Object lock = new Object();
    private static boolean isReadingTurn = true;

    public static void main(String[] args) {
        Thread reading = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                synchronized (lock) {
                    while (!isReadingTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("reading" + i);
                    isReadingTurn = false;
                    lock.notify();
                }
            }
        });

        Thread listening = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                synchronized (lock) {
                    while (isReadingTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("listening" + i);
                    isReadingTurn = true;
                    lock.notify();
                }
            }
        });

        reading.start();
        listening.start();
    }
}
