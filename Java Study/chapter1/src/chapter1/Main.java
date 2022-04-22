package chapter1;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        String firstName = "kouki";
        String lastName = "shida";
        
        System.out.println(getName(firstName, lastName));
        System.out.println();

        int[] arr = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for ( int number : arr) {
            isOdd(number);
        }
    }
    
    public static String getName(String first_name,String last_name) {
        return last_name + first_name;
    }

    public static void isOdd(int num) {
        if(num % 2 != 0) {
          System.out.println(num + "は奇数です。");
          }
    }
}
