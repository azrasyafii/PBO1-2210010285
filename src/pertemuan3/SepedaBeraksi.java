
package pertemuan3;


public class SepedaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Sepeda sepedaku = new Sepeda();
        
        sepedaku.setGir(1);
       
        System.out.println("Gir saat ini: "+sepedaku.getGir());
        
        sepedaku.setNaikGir(3);
        System.out.println("Gir saat ini: "+sepedaku.getGir());
        
        sepedaku.setTurunGir(2);
        System.out.println("Gir saat ini: "+sepedaku.getGir());
    }
}
