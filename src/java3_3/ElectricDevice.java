package java3_3;

abstract public class ElectricDevice {
    private boolean onnOff;
    private int voltageUse_miliamp;
    private int voltageNeeded_watt;

    public ElectricDevice(boolean onnOff, int voltageUse_miliamp, int voltageNeeded_watt) {
        this.onnOff = onnOff;
        this.voltageUse_miliamp = voltageUse_miliamp;
        this.voltageNeeded_watt = voltageNeeded_watt;
    }

    public boolean isOnnOff() {
        return onnOff;
    }

    public void setOnnOff(boolean onnOff) {
        this.onnOff = onnOff;
    }

    public int getVoltageUse_miliamp() {
        return voltageUse_miliamp;
    }

    public void setVoltageUse_miliamp(int voltageUse_miliamp) {
        this.voltageUse_miliamp = voltageUse_miliamp;
    }

    public int getVoltageNeeded_watt() {
        return voltageNeeded_watt;
    }

    public void setVoltageNeeded_watt(int voltageNeeded_watt) {
        this.voltageNeeded_watt = voltageNeeded_watt;
    }
    public abstract void voltageUse_miliamp();
    public abstract void voltageNeeded_watt();
    /**this declaration lets you use an anonymous function later*/

}
