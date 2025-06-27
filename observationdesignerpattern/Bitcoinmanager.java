import java.util.*;
public class Bitcoinmanager implements Bitcointracker {

    int x;
    Random r = new Random();
    List<Observer> registryserviceList = new ArrayList<>();

    public void addregistry(Observer o){
        registryserviceList.add(o);
        
    }
    public void unregister(Observer o){
        registryserviceList.remove(o);
    }
    public void notifyObservers(){
        for(Observer o:registryserviceList){
            o.getnotify();

        }

    }






    @Override
    public int  getbitcoin(){
         x = r.nextInt(1500);

        return x;

    }
    @Override
    public boolean trackbitcoin(int z){
        int y = getbitcoin();

        if(z>y) {
            notifyObservers();
            return true;
        }

        else return false;


    }



    
}
