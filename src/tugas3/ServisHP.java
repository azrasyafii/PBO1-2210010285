
package tugas3;


public class ServisHP {
     //membuat atribut
    String nama, merk, series;
    int penyimpanan, tahunProduksi, noAntrian;
     
    //membuat method constructor
    //1. nama harus sama dengan nama class
    //2. tidak menggunakan kata kunci return dan void
    public ServisHP(String nama, String merk, String series, int penyimpanan, int tahunProduksi, int noAntrian){
        this.nama = nama;
        this.merk = merk;
        this.series = series;
        this.penyimpanan = penyimpanan;
        this.tahunProduksi = tahunProduksi;
        this.noAntrian = noAntrian;
    }
    
    //membuat method biasa hanya untuk menampilkan saja
    public void info(){
        System.out.println("Nama Pelanggan: "+nama);
        System.out.println("Merk HP: "+merk);
        System.out.println("Series HP: "+series);
        System.out.println("Penyimpanan HP: "+penyimpanan);
        System.out.println("Tahun Produksi HP: "+tahunProduksi);
        System.out.println("No Antrian: "+noAntrian);
    }
    
    //method mutator
    void setnoAntrian(int noAntrian){
        this.noAntrian = noAntrian;
    }
    
     void setNaikNoAntrian(int naikNoAntrian){
        noAntrian = noAntrian + naikNoAntrian;
    }
     
      void setTurunNoAntrian(int turunNoAntrian){
        noAntrian = noAntrian - turunNoAntrian;
    }
    //method accessor
    int getnoAntrian(){
        return noAntrian;
    }
}
