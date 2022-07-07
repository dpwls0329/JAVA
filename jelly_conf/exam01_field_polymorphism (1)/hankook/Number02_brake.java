package hankook;

public class Number02_brake implements brake, Pedal {
    public void push(){
        System.out.println("num2 패달");
    }
    public void stop(){
        System.out.println("num2 브레이크");
    }

}
