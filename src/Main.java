public class Main {

    private static int count;

    public static void main(String[] args) {

        var m = new Main();
        new Thread(m.runnable).start();

        new Thread(m.runnable).start();
    }

    Runnable runnable = new Runnable() {
        @Override
        synchronized public void run() {

            count = 0;
            for (int i = 0; i < 10; i++) {

                count++;
                System.out.println(Thread.currentThread().getName() + " " + count);

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    //throw new RuntimeException(e);
                }
            }

        }
    };
}