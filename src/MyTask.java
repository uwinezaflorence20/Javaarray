class MyTask extends Thread {
    private String taskName;

    MyTask(String name) {
        this.taskName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - " + i);
            try {
                Thread.sleep(5000); // pause for 1 second (1000 ms)
            } catch (InterruptedException e) {
                System.out.println(taskName + " was interrupted.");
            }
        }
    }



    public static void main(String[] args) {
        MyTask task1 = new MyTask("Task A");
        MyTask task2 = new MyTask("Task B");

        task1.run();
        task2.run();
    }
}
