package Threads;
class Bike extends Thread{
    public void run(){
        System.out.println("Thread is running...!");
    }

    public static void main(String[] args) {
        Bike b1=new Bike();
        b1.start();
    }
}

class Car implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable Thread is Running..!");
    }

    public static void main(String[] args) {
        Car c1=new Car();
        Thread t1=new Thread(c1);
        t1.start();
    }
}