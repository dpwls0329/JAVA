package Question4;

public class JellyStore {

    People Park = new Buyer();
    People Lee = new Thief();
    People Kim = new Seller();

    void action(){
        Park.Pick("mango");
        Lee.Pick("strawberry");
        Kim.Pick("banana");

        System.out.println();

        Park.Eat("mango");
        Lee.Eat("strawberry");
        Kim.Eat(" ");

        System.out.println();

        Thief thief = (Thief)Lee;
        thief.steel();

        Seller seller = (Seller)Kim;
        seller.sell();

        Buyer buyer = (Buyer)Park;
        buyer.buy();
    }
}
