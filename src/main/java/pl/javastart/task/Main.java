package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Processor processor = new Processor("i7", "Intel", "990123", 3600, 70, 95);
        Memory memory = new Memory("RAM", "Kingston", "989AXP0", 32, 1066, 90, 115);
        HardDrive hardDrive = new HardDrive("SSD", "SanDisk", "XRT670", 512);

        Computer computer = new Computer(processor, memory, hardDrive);

        try {
            System.out.println("RAM Temperature:");
            System.out.println(computer.getMemory().getRamClockTemperature());
            computer.getMemory().overclock();
//            computer.getMemory().overclock();
            System.out.println("RAM Temperature after overclocking:");
            System.out.println(computer.getMemory().getRamClockTemperature());

            System.out.println("GPU Temperature:");
            System.out.println(computer.getProcessor().getGpuClockTemperature());
            computer.getProcessor().overclock();
            computer.getProcessor().overclock();
//            computer.getProcessor().overclock();
            System.out.println("GPU Temperature after overclocking:");
            System.out.println(computer.getProcessor().getGpuClockTemperature());
        } catch (IllegalStateException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
