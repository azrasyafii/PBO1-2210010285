
package tugas2;


public class SmartPhoneBeraksi {
     public static void main(String[] args){
        //membuat objek
        SmartPhone smartphoneazra = new SmartPhone();
        
        //mengisi atribut
        smartphoneazra.merk = "IPhone";
        smartphoneazra.series = "11 Promax";
        smartphoneazra.penyimpanan = 256;
        smartphoneazra.tahunProduksi = 2019;
        
        smartphoneazra.printSmartPhone();
        
        //membuat objek
        SmartPhone smartphonevania = new SmartPhone();
        
        //mengisi atribut
        smartphonevania.merk = "Samsung Galaxy";
        smartphonevania.series = "Z Fold 5";
        smartphonevania.penyimpanan = 512;
        smartphonevania.tahunProduksi = 2020;
        
        smartphonevania.printSmartPhone();
     }
}
