
package pertemuan5;


public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika hitung = new Matematika();
        
        hitung.setPenjumlahan(5, 3);
        hitung.tampilHasil();
        
        hitung.setPengurangan(5, 3);
        System.out.println("Hasil: "+hitung.getHasil());
        
        hitung.setPerkalian(5, 3);
        hitung.tampilHasil();
        
        hitung.setPembagian(5, 3);
        hitung.tampilHasil();
    }
}
