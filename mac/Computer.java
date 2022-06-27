package mac;

public class Computer {
    public String name;
    public String cpu;
    public String ram;
    public String ssd;

    public Computer(String name){
        this.name = name;
        this.cpu = new CPU().name;
        this.ram = new RAM().memory + "GB";
        this.ssd = new SSD().space + "GB";
    }

    public Computer(String name, CPU cpu, RAM ram){
        this.name = name;
        this.cpu = cpu.name;
        this.ram = ram.memory + "GB";
        this.ssd = new SSD().spacee + "GB";
    }
}