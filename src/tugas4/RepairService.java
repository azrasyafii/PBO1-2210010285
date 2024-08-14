
package tugas4;



public class RepairService extends Service {
    private String repairType;

    // Constructor
    public RepairService(String nama, String serviceName, int harga, String repairType) {
        super(nama, serviceName, harga);
        this.repairType = repairType;
    }

    // Getter dan Setter untuk repairType
    public String getRepairType() {
        return repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType;
    }

    // Override metode displayInfo untuk menampilkan informasi tambahan
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Repair Type: " + repairType);
    }
}

