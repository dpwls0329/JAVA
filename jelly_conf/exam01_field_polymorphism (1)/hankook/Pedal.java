package hankook;
import exam01_field_polymorphism.*;

public interface Pedal {
    public void push();

    default void defaultPedal(Tire abc){
        if(abc instanceof HankookTire){
            System.out.println(" hankook set");
        }else if(abc instanceof KumhoTire){
            System.out.println("new kumho set");
        } else if (abc instanceof newHankookTire) {
            System.out.println("new hankook set");

        }
    }
}
