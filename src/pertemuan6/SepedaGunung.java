
package pertemuan6;


public class SepedaGunung extends Sepeda{
    //method yang menerapkan overriding
    @Override
    public void setTambahGir(int pertambahanGir){
        super.setTambahGir(pertambahanGir);
        gir = 2*getGir();
    }
    
}
