import java.util.Random;
public class PirmasThreadas extends Thread  implements Runnable {

    int SUM;

    @Override
    public void run() {
        int finishas = 0;
        do (finishas < 1000)
                {
                Random gen = new Random();
                SUM = gen.nextInt(99) + gen.nextInt(99);
                System.out.println(Thread.currentThread().getName() + "  " + SUM);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finishas += SUM;

            } while (finishas > 1000){
            System.out.println("Finishas" + finishas);
        }
        }
    }










