package study2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public class Main {
    
    public static final String SHOP_SHOHIN_00 = "バナナ";
    public static final String SHOP_SHOHIN_01 = "牛乳";
    public static final String SHOP_SHOHIN_02 = "豚肉";
    public static final String SHOP_SHOHIN_03 = "コロッケ";


    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        // ① 定数を全て使って、String型のListを記述してください。
        List<String> shohinList = new ArrayList<>() {
            {
                add(SHOP_SHOHIN_00);
                add(SHOP_SHOHIN_01);
                add(SHOP_SHOHIN_02);
                add(SHOP_SHOHIN_03);
            }
        };
        
     // ② 以下の「shopMap.put(shohinList.get(1), 180);」の処理について、コメントを記述してください。
        /*
         * 牛肉のkeyと180の値を
         *
         */
        LinkedHashMap<String, Integer> shopMap = new LinkedHashMap<String, Integer>();
        shopMap.put(shohinList.get(0), 125);
        shopMap.put(shohinList.get(1), 180);
        shopMap.put(shohinList.get(2), 350);
        shopMap.put(shohinList.get(3), 100);
        
        for ( Entry<String,Integer> list : shopMap.entrySet() ) {
            System.out.println(list.getKey() + "=" + list.getValue() + "円になります！");
        }
    }

}
