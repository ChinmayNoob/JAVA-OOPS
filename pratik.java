class MyThread extends Thread {
    public void run() {
        System.out.println("Hello this is OOPS practical");
    }
}
public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();
    }
}
