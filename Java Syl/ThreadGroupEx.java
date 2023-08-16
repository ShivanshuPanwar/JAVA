class Test implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class ThreadGex {
    public static void main(String args[]) {
        Test t = new Test();
        ThreadGroup tg = new ThreadGroup("OOPS");
        Thread t1 = new Thread(tg,t,"Shiva");
        t1.start();
        Thread t2 = new Thread(tg,t,"MCA");
        t2.start();
        System.out.println("Thread group name:"+tg.getName());
        tg.list();
    }
}
