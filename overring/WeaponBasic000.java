package overring;

public class WeaponBasic000 {
    public static final String defaultName = "주먹";
    public String name = "주먹";
    public int AttRange = 1;
    public int ChangeTime = 1;

    public void attAction(){
        System.out.println("무기 " +this.name+"을 장착하였습니다");
    }

    public void destruction(){
        System.out.println("무시가 파괴되었습니다");
    }
}
