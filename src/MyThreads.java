public class MyThreads extends Thread {
    @Override
    public void run(){
        System.out.println("Thread " +getName()+ " is running");
        for(int i=0;i<5;i++){
            System.out.println(getName() + ": count - " +i);
            try{
                Thread.sleep(5000);

            }catch(InterruptedException e){
                System.out.println(getName() + " interrupted");

            }
        }
    }

    public static void main(String[] args) {
        MyThreads t1 = new MyThreads();
        MyThreads t2 = new MyThreads();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        t2.start();
        System.out.println("Main thread continue to execute");
    }
}
