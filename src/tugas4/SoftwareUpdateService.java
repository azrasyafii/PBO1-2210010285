
package tugas4;

public class SoftwareUpdateService extends Service {
    private String softwareVersion;

    // Constructor
    public SoftwareUpdateService(String nama, String serviceName, int harga, String softwareVersion) {
        super(nama, serviceName, harga);
        this.softwareVersion = softwareVersion;
    }

    // Getter dan Setter untuk softwareVersion
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    // Override metode displayInfo untuk menampilkan informasi tambahan
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Software Version: " + softwareVersion);
    }
}
