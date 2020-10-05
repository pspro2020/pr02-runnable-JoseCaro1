package ejercicioRunnable;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
           Thread thread= new Thread( new MyRunnable(i),"My Thread "+i);

            if (i%2==0){
                thread.setPriority(Thread.MAX_PRIORITY);
            } else {
                thread.setPriority(Thread.MIN_PRIORITY);
            }
            thread.start();

        }
    }
}
