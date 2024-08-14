
package pertemuan3;


public class Mahasiswa {
    //membuat atribut
    String nama, npm;
    int umur;
    
    //membuta method constructor
    //1. nama harus sama dengan nama class
    //2. tidak menggunakan kata kunci return dan void
    public Mahasiswa(String namaMhs, String npmMhs, int umurMhs){
        nama = namaMhs;
        npm = npmMhs;
        umur = umurMhs;
    }
    
    //membuat method biasa hanya untuk menampilkan saja
    public void info(){
        System.out.println("Nama Mahasiswa: "+nama);
        System.out.println("NPM Mahasiswa: "+npm);
        System.out.println("Umur Mahasiswa: "+umur);
    }
}
