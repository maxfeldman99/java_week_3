package java3_3;

public class VacuumCleaner extends ElectricDevice {
    private boolean isWireless;

    public VacuumCleaner(boolean onnOff, int voltageUse_miliamp, int voltageNeeded_watt, boolean isWireless) {
        super(onnOff, voltageUse_miliamp, voltageNeeded_watt);
        this.isWireless = isWireless;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }
    @Override
    public void voltageUse_miliamp() {
        System.out.println("PC uses 120 watt");

    }

    @Override
    public void voltageNeeded_watt() {
        System.out.println("PC requires 100 watt");

    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "isWireless=" + isWireless +
                '}';
    }
}
