class Test extends Thread {
    public void run() {
        System.out.println("thread running ");
    }
}

class MyThread {
    public static void main(String args[]) {
        Test t = new Test();
        t.start();
        t.setPriority(7);
        System.out.println("Thread Priority:"+t.getPriority());
    }
} 
