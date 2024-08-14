
package pertemuan6;


public class SepedaGunungBeraksi {
    public static void main(String[] args) {
        SepedaGunung spd = new SepedaGunung();
        
        spd.setTambahGir(2);
        
        System.out.println("Gir saat ini: "+spd.getGir());
        
        spd.setTambahGir(3);
        
        System.out.println("Gir saat ini: "+spd.getGir());
    }
}
