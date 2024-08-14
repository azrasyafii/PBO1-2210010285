
package tugas4;


public class Service {
    private String nama, serviceName;
    private int harga;

    // Constructor
    public Service(String nama, String serviceName, int harga) {
        this.nama = nama;
        this.serviceName = serviceName;
        this.harga = harga;
    }
    
    //Contoh Overloading
    public Service(){
        System.out.println("Contoh Overloading saja");
    }

     // Getter dan Setter untuk Nama Pelanggan
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // Getter dan Setter untuk serviceName
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    // Getter dan Setter untuk price
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    // Metode untuk menampilkan informasi layanan
    public void displayInfo(){
        System.out.println("Nama Pelanggan: "+nama);
        System.out.println("Service: " + serviceName + ", Harga: Rp." + harga);
    }
}
