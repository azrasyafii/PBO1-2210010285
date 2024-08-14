
package tugas2;


public class PekerjaanBeraksi {
    public static void main(String[] args){
        //membuat objek
        Pekerjaan pekerjaanazra = new Pekerjaan();
        
        //mengisi atribut dan memberi nilai
        pekerjaanazra.perusahaan = "Rapid Network";
        pekerjaanazra.posisi = "Manager Prov KalSel";
        pekerjaanazra.gaji = 10000000;
        pekerjaanazra.mulaiBekerja = 2021;
        
        pekerjaanazra.printPekerjaan();
        
        //membuat objek
        Pekerjaan pekerjaanvania = new Pekerjaan();
        
        //mengisi atribut
        pekerjaanvania.perusahaan = "Rapid Network";
        pekerjaanvania.posisi = "Lead Admin KalSel";
        pekerjaanvania.gaji = 8000000;
        pekerjaanvania.mulaiBekerja = 2022;
        
        pekerjaanvania.printPekerjaan();
    }
}
