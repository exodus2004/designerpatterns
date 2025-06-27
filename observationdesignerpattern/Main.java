

public class Main {
    public static void main(String[] args) {
        
        Emailservices email  = new Emailservices();
        Smsservices sms = new Smsservices();

        Bitcoinmanager bitm = new Bitcoinmanager();


        

        int present = 900;
        bitm.addregistry(email);
        bitm.addregistry(sms);



        if(bitm.trackbitcoin(present)){}

        


        






    }
    
}
