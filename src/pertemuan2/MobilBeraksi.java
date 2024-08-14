
package pertemuan2;


public class MobilBeraksi {
    public static void main(String[] args){
        //membuat objek
        Mobil mobilku = new Mobil();
        
        //mengisi atribut
        mobilku.warna = "Hitam";
        mobilku.tahunProduksi = 2020;
        
        //menampilkan nilai 
        System.out.println("Warna: "+mobilku.warna);
        System.out.println("Tahun Produksi: "+mobilku.tahunProduksi);
        
        Mobil mobilandi = new Mobil();
        
        mobilandi.warna = "Merah";
        mobilandi.tahunProduksi = 2015;
        
        System.out.println("Warna: "+mobilandi.warna);
        System.out.println("Tahun Produksi: "+mobilandi.tahunProduksi);
    }
}
