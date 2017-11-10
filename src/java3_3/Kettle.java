package java3_3;

public class Kettle extends ElectricDevice {
    private int waterCapacity;

    public Kettle(boolean onnOff, int voltageUse_miliamp, int voltageNeeded_watt, int waterCapacity) {
        super(onnOff, voltageUse_miliamp, voltageNeeded_watt);
        this.waterCapacity = waterCapacity;
    }

    public int getWaterCapacity() {
        return waterCapacity;
    }

    public void setWaterCapacity(int waterCapacity) {
        this.waterCapacity = waterCapacity;
    }

    @Override
    public void voltageUse_miliamp() {
        System.out.println("PC uses 200 watt");


    }

    @Override
    public void voltageNeeded_watt() {
        System.out.println("PC requires watt");

    }

    @Override
    public String toString() {
        return "Kettle{" +
                "waterCapacity=" + waterCapacity +
                '}';
    }
}
