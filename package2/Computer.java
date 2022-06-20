package study.pkg002;

public class Computer {

    public String name;
    public String cpu;
    public String ram;
    public String ssd;

    public Computer(String name) {
        this.name = name;
        this.cpu = new CPU().name;
        this.ram = new Ram().memory + "GB";
        this.ssd = new SSD().space + "GB";
    }
    
    public Computer(String name, CPU cpu, Ram ram) {
        this.name = name;
        this.cpu = cpu.name;
        this.ram = ram.memory + "GB";
        this.ssd = new SSD().space + "GB";
    }

    public Computer(String name, CPU cpu, Ram ram, SSD ssd) {
        this.name = name;
        this.cpu = cpu.name;
        this.ram = ram.memory + "GB";
        this.ssd = ssd.space + "GB";
    }
}
