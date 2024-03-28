package test_data;

public class ComputerData {

    private String processor;
    private String ram;
    private String osType;
    private String hdd;
    private String software;

    public ComputerData(String processor, String ram, String osType, String hdd, String software) {
        this.processor = processor;
        this.ram = ram;
        this.osType = osType;
        this.hdd = hdd;
        this.software = software;
    }

    public String getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    public String getOsType() {
        return osType;
    }

    public String getHdd() {
        return hdd;
    }

    public String getSoftware() {
        return software;
    }

    @Override
    public String toString() {
        return "ComputerData{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", osType='" + osType + '\'' +
                ", hdd='" + hdd + '\'' +
                ", software='" + software + '\'' +
                '}';
    }
}
