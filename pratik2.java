class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable interface is running.");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();
    }
}