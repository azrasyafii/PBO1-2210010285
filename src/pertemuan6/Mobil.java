
package pertemuan6;


public class Mobil {
    private String warna;
    private int tahunProduksi;
    
    //contructor Mobil dengan parameter warna dan tahunProduksi
    public Mobil(String warna, int tahunProduksi){
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }

    public Mobil() {
        //System.out.println("Jalan constructor tanpa parameter");
    }
    
    public Mobil(int tahunProduksi, String warna){
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }
    
    //method biasa
    public void tampilkanInfo(){
        System.out.println("Warna Mobil: "+warna);
        System.out.println("Tahun Produksi Mobil: "+tahunProduksi);
    }
    
    //method biasa dengan parameter nama
    public void tampilkanInfo(String nama){
        System.out.println("Pemilik mobil: "+nama);
        System.out.println("Warna Mobil: "+warna);
        System.out.println("Tahun Produksi Mobil: "+tahunProduksi);
    }
}
