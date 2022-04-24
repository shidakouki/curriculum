package study3;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
     // Dateクラスのインスタンスを生成
        Date now = new Date();
        System.out.println(now);

        // 問① ローカル変数「now」を使用し、本日の日付を表示してください。


        // Calendarクラスのインスタンスを生成
        Calendar calendar = Calendar.getInstance();

        // 問② 「(Calendar.MONTH) + 数値」の処理は、想定していない値となる可能性があります。
        // その理由をコメントへ記述してください。
        // 「月の値+1」であるため、１３月になる可能性がある！
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(Calendar.DATE));
        
        // 問③ 上記の「calendar」を使用し、本日から1年2ヶ月15日先の日付を表示しなさい。
        // - この課題に関しては問題実施日によって結果が異なりますので、Wikiの画像とは結果が異なります。
        // - また、うるう年の場合は設定内容が正しくとも日付がズレて表示される可能性があります。
        calendar.add(Calendar.YEAR, 1);
        calendar.add(Calendar.MONTH, 2);
        calendar.add( Calendar.DATE,15);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(Calendar.DATE));


        // うるう年判定
        printLeapYear(calendar.get(Calendar.YEAR));

    }

    private static void printLeapYear(final int year) {
        System.out.println(year + "年は、うるう年" + (Year.isLeap(year) ? "です。" : "ではありません。"));
    }

}
