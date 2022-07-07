package Question4;

public class Thief extends Jelly implements People {
    public void Eat(String flavor) {
        if(flavor == "mango"){
            System.out.println("Lee는 "+getFlavor1()+"젤리를 먹습니다.");
        } else if (flavor == "strawberry") {
            System.out.println("Lee는 "+getFlavor2()+"젤리를 먹습니다.");
        } else if (flavor == "grape") {
            System.out.println("Lee는 "+getFlavor3()+"젤리를 먹습니다.");
        }
        else{
            System.out.println("먹을 수 없습니다.");
        }
    }
    public void Pick(String flavor){
        if(flavor == "mango"){
            System.out.println("Lee는 "+getFlavor1()+"젤리를 고릅니다.");
        } else if (flavor == "strawberry") {
            System.out.println("Lee는 "+getFlavor2()+"젤리를 고릅니다.");
        } else if (flavor == "grape") {
            System.out.println("Lee는 "+getFlavor3()+"젤리를 고릅니다.");
        }
        else{
            System.out.println("재고가 없습니다.");
        }
    }
    public void steel() {
        System.out.println("Lee는 젤리를 훕칩니다.");
    }

}
