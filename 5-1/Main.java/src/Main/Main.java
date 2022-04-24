package Main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        List<String> array = new ArrayList<>();
        array.add("foo");
        array.add("bar");

        System.out.println(array.get(0) + "のインデックス：2");

        Map<String, Object> map = new HashMap<>();
        map.put("address", "/////");
        map.put("name", "Kosuke");
        map.put("age", "29");

        for (String key : map.keySet()) {
            System.out.println("key : " + key);
        }
        for (Object value : map.values()) {
            System.out.println("value : " + value);
        }

        Calendar cal = Calendar.getInstance();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd");
        String str = sdf.format(cal.getTime());
        String arrayDate[] = str.split(",");
        
        List<String> list = Arrays.asList(arrayDate);

        for (String date : list) {
            System.out.println(date);
        }
    }

}
