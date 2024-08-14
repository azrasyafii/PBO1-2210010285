
package tugas3;


public class ServisHPBeraksi {
    public static void main(String[] args) {
        //membuat objek
        ServisHP hpku = new ServisHP("Muhammad Azra Syafi'i","IPhone","11 Promax",256,2019,16);
        
        hpku.info();
        
        System.out.println("===================================");
        
        hpku.setnoAntrian(16);
        System.out.println("No Antrian saat ini: "+hpku.getnoAntrian());
        
        hpku.setNaikNoAntrian(4);
        System.out.println("No Antrian saat ini: "+hpku.getnoAntrian());
        
        hpku.setTurunNoAntrian(10);
        System.out.println("No Antrian saat ini: "+hpku.getnoAntrian());
    }
}
