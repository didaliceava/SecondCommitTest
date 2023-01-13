package LeranComposition;

public class Computer {
    Monitor monitor;                                //here we are implementing a realtioship between computer class
    Keyboard keyboard;                             // and monitor class, HAS A relationship , computer has a monitor, computer HAS A keyboard using an instance variable monitor.


    Computer(Monitor mon,Keyboard key ){
        this.monitor=mon;
        this.keyboard=key;


    }

    public static void main(String[] args) {
        Monitor Dell=new Monitor("4k",24,"Dell");
        Keyboard Logitech=new Keyboard("white","Logitech");
        Computer Dell5502=new Computer(Dell,Logitech);    //an object is composed of other objects // here computer is composed of monitor object, keyboard object and i can add other object
                                                         // so above i created an instance of monitor obj and keyboard object
        Dell5502.monitor.increaseVol(20);   // here i get acess to monitor and keyboard methods through the object of instance variables : monitor, keyboard


    }



}
