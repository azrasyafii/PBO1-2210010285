
package pertemuan3;


public class MahasiswaThis {
     //membuat atribut
    String nama, npm;
    int umur;
    
    //membuat method constructor
    //1. nama harus sama dengan nama class
    //2. tidak menggunakan kata kunci return dan void
    public MahasiswaThis(String nama, String npm, int umur){
        this.nama = nama;
        this.npm = npm;
        this.umur = umur;
    }
    
    //membuat method biasa hanya untuk menampilkan saja
    public void info(){
        System.out.println("Nama Mahasiswa: "+nama);
        System.out.println("NPM Mahasiswa: "+npm);
        System.out.println("Umur Mahasiswa: "+umur);
    }
}
