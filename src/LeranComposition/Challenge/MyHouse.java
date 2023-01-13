package LeranComposition.Challenge;

public class MyHouse {



    Bedroom bedroom;
    Kitchen kitchen;

    MyHouse (Bedroom bed, Kitchen kit){
        this.bedroom=bed;
        this.kitchen=kit;

    }


    public static void main(String[] args) {

        Kitchen open = new Kitchen("Quartz", "Samsung", 4);
        Bedroom mybed = new Bedroom("King", 4, "white");
MyHouse NEW= new MyHouse(mybed,open);
NEW.kitchen.cook();
NEW.bedroom.sleeping();

    }
}