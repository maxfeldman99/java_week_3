package java3_3;

public class Computer extends ElectricDevice {
    private String ProcessorType;
    private int cpuSpeed_ghz;

    public Computer(boolean onnOff, int voltageUse_miliamp, int voltageNeeded_watt, String processorType, int cpuSpeed_ghz) {
        super(onnOff, voltageUse_miliamp, voltageNeeded_watt);
        this.ProcessorType = processorType;
        this.cpuSpeed_ghz = cpuSpeed_ghz;
    }

    public String getProcessorType() {
        return ProcessorType;
    }

    public void setProcessorType(String processorType) {
        ProcessorType = processorType;
    }

    public int getCpuSpeed_ghz() {
        return cpuSpeed_ghz;
    }

    public void setCpuSpeed_ghz(int cpuSpeed_ghz) {
        this.cpuSpeed_ghz = cpuSpeed_ghz;
    }

    @Override
    public void voltageUse_miliamp() {
        System.out.println("PC uses 200 watt");
    }

    @Override
    public void voltageNeeded_watt() {
        System.out.println("PC requires 150 watt");

    }

    @Override
    public String toString() {
        return "Computer{" +
                "ProcessorType='" + ProcessorType + '\'' +
                ", cpuSpeed_ghz=" + cpuSpeed_ghz +
                '}';
    }
}
