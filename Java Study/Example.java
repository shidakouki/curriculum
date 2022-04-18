public class Example {

   public static void main(String[] args) {
    //   System.out.println("Hello World");
      
      int hogeInt = 50;

      String hogeString = ("テスト");

    //   double(浮動小数点型)型の hogeDouble という名前の変数を宣言し、値「0.2」で初期化
      double hogeDouble = 0.2;

      hogeInt = 100;

      hogeString = ("合格");

      System.out.println(hogeInt);

    //   変数 hogeString の値を表示
      System.out.println(hogeString);

      System.out.println(hogeDouble);

      String[] country = {"JAPAN","AMERICA","KOREA"};

      System.out.println(country.length);

      String[] strArray = {"りんご","もも","ぶどう"};

      System.out.println(strArray[1]);

      // int［］型の変数intArrayの宣言と初期化
      int[] intArray = { 10, 20, 30, 40, 50 };
      
      // 配列intArrayの20+50の計算を出力
      System.out.println(intArray[1] + intArray[4]);

      int plus = 5 + 10;

      int minus = 20 - 7;

      // 10 と　2　を乗算した値を代入する、変数multiplyを作成
      int multiply = 10 * 2;
      
      int remi = 20 % 6;

      // Stringクラスの変数　town　に　有楽町　で初期化
      // Stringクラスの変数　line　に　線　で初期化
      String town = "有楽町";
      String line = "線";

      String train = town + line;

      System.out.println(plus);
      System.out.println(minus);
      System.out.println(multiply);
      System.out.println(remi);
      System.out.println(train);

      private static final String USER_NAME = "alice";
      private static final String USER_PASSWORD = "alice123";
      private static final String CONST_MSG_SUCCESS = "ログイン成功です。";
      private static final String CONST_MSG_ERROR_NAME = "名前に誤りがあります。";
      private static final String CONST_MSG_ERROR_PASS = "パスワードに誤りがあります。";
      private static final String CONST_MSG_ERROR_INPUT = "入力情報に誤りがあります。";
      String name = "alice";
      String pass = "alice123";

      if ( name.equals(USER_NAME) && pass.equals(USER_PASSWORD) ) {
        System.out.println(CONST_MSG_SUCCESS);
      } else if ( name.equals(USER_NAME) && pass != (USER_PASSWORD) ) {
        System.out.println(CONST_MSG_ERROR_PASS);
      } else if ( name !=(USER_NAME) && pass.equals(USER_PASSWORD) ) {
        System.out.println(CONST_MSG_ERROR_NAME);
      } else {
        System.out.println(CONST_MSG_ERROR_INPUT);
      }

   }   
}