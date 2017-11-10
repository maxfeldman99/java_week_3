package java3_3;

public class main {
    public static void main(String[] args) {
        ElectricDevice[] devices = new ElectricDevice[4];
        devices[0] = new Kettle(true, 200, 150, 2);
        devices[1] = new VacuumCleaner(true, 200, 150, false);
        devices[2] = new Computer(false, 210, 160, "intel", 1200);
        devices[3] = new ElectricDevice(true,50,20) {
            @Override
            public void voltageUse_miliamp() {
                System.out.println("Toaster uses 50 amp");
            }

            @Override
            public void voltageNeeded_watt() {
                System.out.println("Toaster needs 30 amp");

            }
        };
        System.out.println("the devices are :");
        for (int i = 0; i <devices.length ; i++) {
            System.out.println(devices[i]);
        }
        for (int i = 0; i <devices.length ; i++) {
            System.out.println(devices[i].getVoltageNeeded_watt() +" watt ");
            System.out.println(devices[i].getVoltageUse_miliamp() +" amp ");
            System.out.println(devices[i].isOnnOff());
            if(devices[i] instanceof Kettle){
                System.out.println("the water capacity is " + ((Kettle) devices[i]).getWaterCapacity());
            }
            else if(devices[i] instanceof  Computer){
                System.out.println("the processor type is " +((Computer)devices[i]).getProcessorType()+ " and the"+
                        " cpu speed is " +((Computer)devices[i]).getCpuSpeed_ghz());
            } else if (devices[i] instanceof VacuumCleaner) {
                System.out.println("the vacuum cleaner wireless type is : " + ((VacuumCleaner)devices[i]).isWireless());
            }
            }

        }

        }



