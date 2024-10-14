package Multithreading;



class ThreadExample extends Thread {

    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("from thread method " +i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException ignored){
            }
        }
    }
}

class A{
    public void Method1(){
        System.out.println("from A method");
    }
}

class RunnableExample implements Runnable {

    public void run(){
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for(int i=0;i<=10;i++){
            System.out.println("from runnable method " +i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ignored){
            }
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        ThreadExample t = new ThreadExample();
//        t.start();
//
//        System.out.println("Main thread started");
//        RunnableExample r = new RunnableExample();
//        r.run();


        RunnableExample runnable = new RunnableExample();

       // runnable.run();
        Thread thread = new Thread(runnable);

        System.out.println(thread.getState());
thread.start();
        System.out.println(thread.getState());

        Thread.sleep(1000);

        System.out.println(thread.getState());

        Thread.sleep(8000);
        System.out.println(thread.getState());


//        Thread t1 = new Thread(() -> {
//
//            for
//
//        });
//        Thread t2= new Thread(){
//
//            public void run(){
//
//                for(int i=0;i<=10;i++){
//                    System.out.println("from t2" +i);
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//
//        };

//
//        thread.start();
//thread.join();
//        t2.start();
//
//        thread.setName("sharan");
//        System.out.println(thread.getName());

    }

}
