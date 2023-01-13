package LeranComposition;

public class Monitor {

    String resolution;
    int size;
    String manufacturer;
    int VolLevel;

    Monitor (String resolution,int size,String manufacturer) {
        this.resolution = resolution;
        this.size = size;
        this.manufacturer = manufacturer;
        this.VolLevel=0;
    }


        void increaseVol(int increaseBy){
        for(int i=VolLevel; i<= VolLevel+increaseBy; i++) {
            System.out.println("Volume is : " + i);
        }

             this.VolLevel=this.VolLevel+increaseBy;
            System.out.println("Volume is set to :"+VolLevel);


    }
       /* void decreaseVol(int decreaseBy){
        for(int i=0;i>=this.VolLevel+decreaseBy;i--){

        }
            System.out.println("monitor power on");
        }*/








    void powerOn(){
        System.out.println(this.manufacturer+ "monitor is powering on");
    }
    void powerOff(){
        System.out.println("monitor powering off");
    }
}
