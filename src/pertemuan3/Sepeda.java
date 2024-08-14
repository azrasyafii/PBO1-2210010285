
package pertemuan3;


public class Sepeda {
    int gir;
    
    //method mutator
    void setGir(int gir){
        this.gir = gir;
    }
    
     void setNaikGir(int naikGir){
        gir = gir + naikGir;
    }
     
      void setTurunGir(int turunGir){
        gir = gir - turunGir;
    }
    //method accessor
    int getGir(){
        return gir;
    }
}
