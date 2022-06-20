package study.pkg002;

public class CPU {

    public String name;

    public CPU() {
        this.name = "Intel";
    }

    public CPU(String name){
        
        switch(name){
            case "intel":
            case "AMD":
                this.name = name;
                break;
            default:
                this.name = "intel";
             break;
        }
            

        
    }
}
