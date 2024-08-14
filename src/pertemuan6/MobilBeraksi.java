
package pertemuan6;


public class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil("Hitam",2020);
        mobilku.tampilkanInfo();
        
        Mobil mobilmu = new Mobil();
        mobilmu.tampilkanInfo();
        
        Mobil mobilkita = new Mobil(2022, "Merah");
        mobilkita.tampilkanInfo("Mobil kita bersama");
    }
}
