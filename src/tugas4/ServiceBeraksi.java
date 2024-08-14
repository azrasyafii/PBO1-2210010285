
package tugas4;


public class ServiceBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari masing-masing layanan
        Service repairService = new RepairService("Muhammad Azra Syafi'i", "Perbaikan Layar", 350000, "Ganti LCD + Antigores");
        Service updateService = new SoftwareUpdateService("Vania Zalianty", "OS Update", 30000, "Android 14");

        // Menggunakan polimorfisme untuk menampilkan informasi layanan
        repairService.displayInfo();
        System.out.println();
        updateService.displayInfo();
    }
}
