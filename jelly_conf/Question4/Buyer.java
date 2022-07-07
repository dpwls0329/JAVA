package Question4;

public class Buyer extends Jelly implements People{
    public void Eat(String flavor) {
        if(flavor == "mango"){
            System.out.println("Park은 "+getFlavor1()+"젤리를 먹습니다.");
        } else if (flavor == "strawberry") {
            System.out.println("Park은 "+getFlavor2()+"젤리를 먹습니다.");
        } else if (flavor == "grape") {
            System.out.println("Park은 "+getFlavor3()+"젤리를 먹습니다.");
        }
        else{
            System.out.println("먹을 수 없습니다.");
        }
    }
    public void Pick(String flavor){
        if(flavor == "mango"){
            System.out.println("Park은 "+getFlavor1()+"젤리를 고릅니다.");
        } else if (flavor == "strawberry") {
            System.out.println("Park은 "+getFlavor2()+"젤리를 고릅니다.");
        } else if (flavor == "grape") {
            System.out.println("Park은 "+getFlavor3()+"젤리를 고릅니다.");
        }
        else{
            System.out.println("재고가 없습니다.");
        }
    }
    public void buy() {
        System.out.println("Park는 젤리를 삽니다.");
    }
}
