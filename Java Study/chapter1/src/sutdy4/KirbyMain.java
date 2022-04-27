package sutdy4;

public class KirbyMain {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        // まずはプラズマを吸い込む！
        AbilityOfEnemy aoe = new PlasmaWisp("プラズマはどうだん！！！！");
         // 打つべし！
        aoe.useAbility();
         // 続いてナイトを吸い込む！
        aoe = new BradeKnight("ひゃくれつぎり！！！");
         // 切るべし！
        aoe.useAbility();
        
    }

}
