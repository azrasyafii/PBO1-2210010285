
package pertemuan2;


public class MobilBeraksi2 {
    public static void main(String[] args){
        //membuat objek
        Mobil2 mobilku = new Mobil2();
        
        //mengisi atribut
        mobilku.warna = "Hitam";
        mobilku.tahunProduksi = 2020;
        
        //menampilkan nilai 
        //System.out.println("Warna: "+mobilku.warna);
        //System.out.println("Tahun Produksi: "+mobilku.tahunProduksi);
        mobilku.printInfo();
        
        Mobil2 mobilandi = new Mobil2();
        
        mobilandi.warna = "Merah";
        mobilandi.tahunProduksi = 2015;
        
        //System.out.println("Warna: "+mobilandi.warna);
        //System.out.println("Tahun Produksi: "+mobilandi.tahunProduksi);
        mobilandi.printInfo();
    }
}
