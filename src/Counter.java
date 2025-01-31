public class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }


    public static class SynchronizedThreads {
        public static void main(String[] args) {
            Counter counter = new Counter();

            // Create two threads that will increment the counter
            Thread thread1 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            });

            Thread thread2 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            });

            // Start both threads
            thread1.start();
            thread2.start();

            // Wait for both threads to finish
            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Print the final count value
            System.out.println("Final count: " + counter.getCount());
        }
    }
}