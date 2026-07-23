public class Thread2  {
    private static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread start = new Thread(new WorkerTask());
        System.out.println("state after creation: " + start.getState());

            start.start();
        System.out.println("state after start(): " + start.getState());

        Thread.sleep(100);
        System.out.println("State during sleep(): " + start.getState());

        synchronized (lock) {
            Thread.sleep(1000);
            System.out.println("state while waiting for lock: " + start.getState());
        }

        start.join();
        System.out.println("state after completion: " + start.getState());
    }

    static class WorkerTask implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(500);

                synchronized (lock) {
                    System.out.println(" Thead is lock successfully!");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
