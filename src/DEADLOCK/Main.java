package DEADLOCK;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String first = "Ahoy there";
        String second = " What`s up ";

        Thread t1 = new Thread()
        {
            public void run()
        {
           synchronized (first){
               System.out.println((char)27+"[95m"+first+(char)27+"[0m"+" from Thread 1");
               try {Thread.sleep(1000);

               }catch (InterruptedException e){
                   System.out.println(e);
               }
               synchronized (second){
                   System.out.println(second+" from Thread 1");
               }
           }
        }
        };
        Thread t2 = new Thread()
        {
            public void run()
            {
                synchronized (second){
                    System.out.println((char)27+"[93m"+second+(char)27+"[0m"+" from Thread 2");
                    try {Thread.sleep(1000);

                    }catch (InterruptedException e){
                        System.out.println(e);
                    }
                    synchronized (first){
                        System.out.println(first+" from Thread 2");
                    }
                }
            }
        };
t1.start();
t2.start();

    }
}
